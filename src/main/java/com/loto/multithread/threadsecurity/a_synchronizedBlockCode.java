package com.loto.multithread.threadsecurity;

/**
 * Author：蓝田_Loto
 * Date：2018-12-27 19:06
 * <p>PageName：a_synchronizedBlockCode.java
 * </p>
 * <p>Function：解决线程安全问题方式1_同步代码块
 */

public class a_synchronizedBlockCode {
    public static void main(String[] args) {
        // 创建票对象
        Ticket1 ticket = new Ticket1();

        //创建3个窗口
        Thread t1 = new Thread(ticket, "窗口1");
        Thread t2 = new Thread(ticket, "窗口2");
        Thread t3 = new Thread(ticket, "窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
