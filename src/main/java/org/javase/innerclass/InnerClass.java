package org.javase.innerclass;

/**
 * 内部类练习
 */
public class InnerClass {

    public static void main(String[] args) {
        //静态内部类创建对象
        InnerClass.Inner2 inner2=new InnerClass.Inner2();
        //非静态内部类创建对象
        InnerClass innerClass =new InnerClass();
        InnerClass.Inner1 inner1=innerClass.new Inner1();

        String a="abc";
        String b=a+"def";
        System.out.println(b);
    }
    public InnerClass(){

        class Get3{

        }
    }

    //非静态成员内部类
    public class Inner1{

    }
    //静态成员内部类
    public static class Inner2{

    }


    public static void get(){
        //局部内部类
        class Get1{

        }

    }
      {
        class Get2{

        }
    }
}
