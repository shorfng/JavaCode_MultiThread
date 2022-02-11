package com.loto.multithread.runnable;

/**
 * Author：蓝田_Loto
 * Date：2018-12-27 18:45
 * <p>PageName：a_Runnable.java
 * </p>
 * <p>Function：Runnable接口
 */

public class a_Runnable {
    public static void main(String[] args) {
        // 创建线程执行目标类对象
        Runnable runnable = new MyRunnable();

        // 将Runnable接口的子类对象作为参数传递给Thread类的构造函数
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        // 开启线程
        thread1.start();
        thread2.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("main线程：i=" + i);
        }
    }
}
