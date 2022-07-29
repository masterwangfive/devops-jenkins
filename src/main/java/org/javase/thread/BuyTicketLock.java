package org.javase.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BuyTicketLock implements Runnable{
    static int ticketNum=10;
	Lock lock =new ReentrantLock();
	@Override
	public void run() {

		   for (int i = 0; i < 100; i++) {
               lock.lock(); //打开锁
			   try{

				   if (ticketNum > 0) {
					   System.out.println("我在：" + Thread.currentThread().getName() + "买了那个票：" + ticketNum--);
				   }

		   }
			   catch(Exception e){}
			   finally {
				   lock.unlock(); //关闭锁
			   }
	   }


	}
}
class TestLock{
    public static void main(String[] args) {
        BuyTicketLock buyTicketLock=new BuyTicketLock();
        Thread t1=new Thread(buyTicketLock);
        t1.start();
        BuyTicketLock b2=new BuyTicketLock();
        Thread t2=new Thread(b2);
        t2.start();
        BuyTicketLock b3=new BuyTicketLock();
        Thread t3=new Thread(b3);
        t3.start();
    }

}