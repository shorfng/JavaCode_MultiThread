package com.loto.thread.a.create.a.thread;

/**
 * Author：蓝田_Loto<p>
 * Date：2018-12-27 16:22<p>
 * PageName：NewThread.java<p>
 * Function：创建线程
 */

public class NewThread {
    public static void main(String[] args) {
        // 创建自定义线程对象
        ExtendsThread thread1 = new ExtendsThread();
        ExtendsThread thread2 = new ExtendsThread();

        // 开启线程（调用线程的 start 方法）
        thread1.run();   // 没有开启新线程，在主线程中调用 run 方法
        thread2.start(); // 开启一个新线程，在新线程中调用 run 方法
    }
}
