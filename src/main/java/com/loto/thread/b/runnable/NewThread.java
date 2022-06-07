package com.loto.thread.b.runnable;

/**
 * Author：蓝田_Loto<p>
 * Date：2018-12-27 18:45<p>
 * PageName：NewThread.java<p>
 * Function：创建线程
 */

public class NewThread {
    public static void main(String[] args) {
        // 通过 new 创建任务对象
        ImplementsRunnable runnable = new ImplementsRunnable();

        // 通过 new Thread 创建线程，用来承载上面的任务（将 Runnable 接口的子类对象 runnable 作为参数传递给 Thread 类的构造函数）
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        // 开启线程（调用线程的 start 方法）
        thread1.start();
        thread2.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("main线程：i=" + i);
        }
    }
}
