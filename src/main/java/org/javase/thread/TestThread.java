package org.javase.thread;

public class TestThread {
    public static void main(String[] args) {

            BuyTicketThread b1=new BuyTicketThread("窗口1");
            b1.start();

            BuyTicketThread b2=new BuyTicketThread("窗口2");
            b2.start();
            BuyTicketThread b3=new BuyTicketThread("窗口3");
            b3.start();


    }

}
