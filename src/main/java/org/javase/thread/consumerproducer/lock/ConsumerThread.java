package org.javase.thread.consumerproducer.lock;

public class ConsumerThread extends Thread{

    //商品 公共
    private Commodity commodity;
    public ConsumerThread (Commodity commodity){
       this.commodity=commodity;
   }

    @Override
    public void run() {
       /* for (int i = 0; i <= 10; i++) {
            synchronized (commodity) {
                System.out.println("我是消费者：我消费了" + commodity.getBrand() + "-----" + commodity.getName());
            }

        }*/
        for (int i = 0; i <= 10; i++) {
            commodity.consumerProduct();
        }

    }
}
