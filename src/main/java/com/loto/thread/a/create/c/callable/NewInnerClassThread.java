package com.loto.thread.a.create.c.callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * Author：蓝田_Loto<p>
 * Date：2022-06-07 20:23<p>
 * PageName：NewInnerClassThread.java<p>
 * Function：匿名内部类的方式
 */

public class NewInnerClassThread {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // 方式1：ExecutorService + Future + submit
        ExecutorService executorService1 = Executors.newCachedThreadPool();
        Future<Object> future1 = executorService1.submit(() -> {
            System.out.println("executorService1.submit");
            return "1";
        });

        // 方式2：ExecutorService + Future + submit + FutureTask
        ExecutorService executorService2 = Executors.newCachedThreadPool();
        Future<?> future2 = executorService2.submit(new FutureTask<>(() -> {
            System.out.println("executorService.submit --- FutureTask");
            return "2";
        }));

        // 方式3：FutureTask + run
        FutureTask<Object> futureTask = new FutureTask<>(() -> {
            System.out.println("futureTask.run");
            return "3";
        });
        futureTask.run();
        System.out.println(futureTask.get().toString());
    }
}
