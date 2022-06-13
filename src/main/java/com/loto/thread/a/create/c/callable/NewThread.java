package com.loto.thread.a.create.c.callable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/**
 * Author：蓝田_Loto<p>
 * Date：2022-06-07 20:17<p>
 * PageName：NewThread.java<p>
 * Function：创建线程
 */

public class NewThread {
    public static void main(String[] args) {
        // 方式1：ExecutorService + submit
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.submit(new ImplementsCallable());

        // 方式2：FutureTask + run
        FutureTask task = new FutureTask(new ImplementsCallable());
        task.run();
    }
}
