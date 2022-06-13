package com.loto.thread.a.create.c.callable;

import java.util.concurrent.Callable;

/**
 * Author：蓝田_Loto<p>
 * Date：2022-06-07 20:15<p>
 * PageName：ImplementsCallable.java<p>
 * Function：线程 - 创建方式（实现 Runnable 接口）
 */

public class ImplementsCallable implements Callable {

    @Override
    public Object call() throws Exception {
        for (int i = 1; i <= 50; i++) {
            System.out.println("第三种线程：" + i);
        }
        return "第三种线程执行完毕";
    }
}
