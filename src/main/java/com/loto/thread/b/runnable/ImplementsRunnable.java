package com.loto.thread.b.runnable;

/**
 * Author：蓝田_Loto<p>
 * Date：2018-12-27 18:46<p>
 * PageName：ImplementsRunnable.java<p>
 * Function：线程 - 创建方式（实现 Runnable 接口）
 */

public class ImplementsRunnable implements Runnable {
    // 重写 run 方法
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("我的线程：i=" + i);
        }
    }
}
