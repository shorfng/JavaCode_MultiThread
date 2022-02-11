package com.loto.multithread.thread;

/**
 * Author：蓝田_Loto
 * Date：2018-12-27 16:26
 * <p>PageName：MyThread.java
 * </p>
 * <p>Function：创建线程的方法1（继承Thread类）
 */

public class MyThread extends Thread {
    public MyThread() {

    }

    // 重写run方法，完成该线程执行的逻辑
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ",i=" + i);
        }
    }
}
