package org.javase.thread.consumerproducer.lock;

public class ProducerThread extends Thread{

    //商品 公共
    private Commodity commodity;
    public ProducerThread (Commodity commodity){
        this.commodity=commodity;
    }
    @Override
    public void run() {
       /* synchronized (commodity){
            for (int i = 0; i <= 10; i++) {
                if(i%2==0){
                    commodity.setBrand("费力罗");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    commodity.setName("巧克力");

                }else{
                    commodity.setBrand("哈尔滨");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    commodity.setName("啤酒");

                }
                System.out.println("我是生产者：我生产了"+commodity.getBrand()+"-----"+commodity.getName());
            }
        }*/
        for (int i = 0; i <=10; i++) {
            if(i%2==0){
                try {
                    commodity.producerProduct("费列罗","巧克力");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            else{
                try {
                    commodity.producerProduct("哈尔滨","啤酒");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
