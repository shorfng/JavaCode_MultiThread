package com.loto.multithread.threadsecurity;

/**
 * Author：蓝田_Loto
 * Date：2018-12-27 19:08
 * <p>PageName：Ticket2.java
 * </p>
 * <p>Function：解决线程安全问题方式2_同步方法
 */

public class Ticket2 implements Runnable {
    // 共100票
    private int ticket = 100;

    // 定义锁对象
    Object lock = new Object();

    @Override
    public void run() {
        // 模拟卖票
        while (true) {
            // 同步方法
            method();
        }
    }

    // 同步方法,锁对象this
    private synchronized void method() {
        if (ticket > 0) {
            // 模拟选坐的操作
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + "正在卖票，目前还剩余票数为：" + ticket--);
        }
    }
}
