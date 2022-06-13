package com.loto.thread.a.create.a.thread;

/**
 * Author：蓝田_Loto<p>
 * Date：2018-12-27 16:26<p>
 * PageName：ExtendsThread.java<p>
 * Function：线程 - 创建方式（继承 Thread 类）
 */

public class ExtendsThread extends Thread {
    public ExtendsThread() {
    }

    // 重写 run 方法，完成该线程执行的逻辑
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ",i=" + i);
        }
    }
}
