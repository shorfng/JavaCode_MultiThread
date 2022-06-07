package com.loto.thread.b.runnable;

/**
 * Author：蓝田_Loto<p>
 * Date：2018-12-27 18:46<p>
 * PageName：MyRunnable.java<p>
 * Function：线程 - 创建方式（实现 Runnable 接口）
 */

public class ImplementsRunnable implements Runnable {
    // 定义线程要执行的run方法逻辑
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("我的线程：i=" + i);
        }
    }
}
