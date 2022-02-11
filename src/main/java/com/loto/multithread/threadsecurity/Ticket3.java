package com.loto.multithread.threadsecurity;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Author：蓝田_Loto
 * Date：2018-12-27 19:08
 * <p>PageName：Ticket3.java
 * </p>
 * <p>Function：解决线程安全问题方式（最终版）_使用Lock接口
 */

public class Ticket3 implements Runnable {
    // 共100票
    private int ticket = 100;

    // 创建Lock锁对象
    private Lock ck = new ReentrantLock();

    @Override
    public void run() {
        // 模拟卖票
        while (true) {
            ck.lock();  // 上锁
            if (ticket > 0) {
                // 模拟选坐的操作
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "正在卖票，目前还剩余票数为：" + ticket--);
            }
            ck.unlock(); // 释放锁
        }
    }
}
