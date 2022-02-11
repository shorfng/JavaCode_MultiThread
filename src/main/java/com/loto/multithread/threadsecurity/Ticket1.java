package com.loto.multithread.threadsecurity;

/**
 * Author：蓝田_Loto
 * Date：2018-12-27 19:08
 * <p>PageName：Ticket1.java
 * </p>
 * <p>Function：解决线程安全问题方式1_同步代码块
 */

public class Ticket1 implements Runnable {
    // 共100票
    private int ticket = 100;

    // 定义锁对象
    private Object lock = new Object();

    @Override
    public void run() {
        // 模拟卖票
        while (true) {
            // 同步代码块
            synchronized (lock) {
                if (ticket > 0) {
                    // 模拟电影选坐的操作
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在卖票，目前还剩余票数为：" + ticket--);
                }
            }
        }
    }
}
