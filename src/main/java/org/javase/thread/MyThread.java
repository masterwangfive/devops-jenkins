package org.javase.thread;

/***
 * Thread 多线程的启动
 */
public class MyThread extends Thread{

        public void  run(){
            for(int i=0;i<200;i++){
                System.out.println(i+" :我在看书");
            }
        }


    public static void main(String[] args) {
        Thread t =new Thread(new MyThread());
        t.start();

        for (int i=0;i<1000;i++){
            System.out.println(i+" :我在学习多线程");
        }
    }
}
