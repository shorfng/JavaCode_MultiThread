package com.loto.thread.b.status;

import java.util.concurrent.TimeUnit;

/**
 * Author：蓝田_Loto<p>
 * Date：2022-06-13 15:12<p>
 * PageName：ThreadStatus.java<p>
 * Function：线程生命周期 / 线程状态
 */

public class ThreadStatus {
    public static void main(String[] args) {
        new Thread(() -> {
            while (true) {
                try {
                    TimeUnit.SECONDS.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "TIME_WAITING").start();

        new Thread(() -> {
            while (true) {
                synchronized (ThreadStatus.class) {
                    try {
                        ThreadStatus.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "WAITING");

        new Thread(new BlockDemo(), "BLOCKED-01").start();  // 抢占到锁
        new Thread(new BlockDemo(), "BLOCKED-02").start();  // 阻塞
    }

    static class BlockDemo extends Thread {
        @Override
        public void run() {
            synchronized (BlockDemo.class) {
                while (true) {
                    try {
                        TimeUnit.SECONDS.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
