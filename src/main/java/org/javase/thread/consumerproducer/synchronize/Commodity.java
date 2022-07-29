package org.javase.thread.consumerproducer.synchronize;

/**
 * 商品类
 */
public class Commodity {
    String brand;
    String name;
    // 红色：有商品，消费者可以消费  绿色：没有商品，生产者可以生产
    boolean flag = false;  //默认没有商品，先开始生产，然后再消费
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 生产者同步方法 注意this的用法，还是要注意锁的时候到底锁的是那个东西？
     * @param brand
     * @param name
     */
    public synchronized void producerProduct(String brand, String name) throws InterruptedException {
        if(flag==true){ // 如果灯是红色的，表示有商品了，等着让消费者去消费
            wait();
        }
        //灯是绿色的，生产
        this.setBrand(brand);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setName(name);
        System.out.println("我是生产者：我生产了"+this.getBrand()+"-----"+this.getName());

        flag=true; //灯变成红色
        notify(); //通知其他线程可以消费了
    }

    /**
     * 消费者
     */
    public synchronized  void consumerProduct(){
        if (!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("我是消费者：我消费了" + this.getBrand() + "-----" + this.getName());
        flag=false; //灯变成绿色
        notify(); //通知生产者可以生产了
    }

}
