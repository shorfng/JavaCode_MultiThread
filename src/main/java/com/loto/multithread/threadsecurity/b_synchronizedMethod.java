package com.loto.multithread.threadsecurity;

/**
 * Author：蓝田_Loto
 * Date：2018-12-27 19:29
 * <p>PageName：b_synchronizedMethod.java
 * </p>
 * <p>Function：解决线程安全问题方式2_同步方法
 */

public class b_synchronizedMethod {
    public static void main(String[] args) {
        // 创建票对象
        Ticket2 ticket = new Ticket2();

        //创建3个窗口
        Thread t1 = new Thread(ticket, "窗口1");
        Thread t2 = new Thread(ticket, "窗口2");
        Thread t3 = new Thread(ticket, "窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
