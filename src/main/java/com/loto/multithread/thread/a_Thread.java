package com.loto.multithread.thread;

/**
 * Author：蓝田_Loto
 * Date：2018-12-27 16:22
 * <p>PageName：a_Thread.java
 * </p>
 * <p>Function：Thread类
 */

public class a_Thread {
    public static void main(String[] args) {
        // 创建自定义线程对象
        MyThread d1 = new MyThread();
        MyThread d2 = new MyThread();

        d1.run();   // 没有开启新线程, 在主线程调用run方法
        d2.start(); // 开启一个新线程，新线程调用run方法
    }
}
