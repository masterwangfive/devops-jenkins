package org.javase.operators;
import org.junit.jupiter.api.Test;


/**
 * 练习运算符的用法
 * ++ 运算符
 * = 赋值运算符
 * %，/运算符
 */
public class Test01 {
    @Test
    /**
     * %,/运算符使用
     * 给定一个数，取出每个位上的数
     */
    public void test0(){
        int a=1782;
        int g=a%10;
        int s=a/10%10;
        int b=a/100%10;
        int q=a/1000;
        System.out.println("个位："+g+"，十位："+s+"，百位："+b+"，千位："+q);
    }
    @Test
    /**
     * 面试：++运算符
     * 1,运算符优先级 ++ > +
     * 2,++参与到运算中，需要看++在前还是在后
     * 如果++在后，则先运算，再加一
     * 如果++在前，则先加一，再运算
     */
    public void test1(){
        int a=5;
        int b=5;
        System.out.println(a++ + b++); //a=6,b=6  ->10
        System.out.println(a++ + ++b); //6+7=13 a=7,b=7
        System.out.println(++a + b++); //a=7+1,8+7=15 ,b=8
        System.out.println(++a + ++b); //a=9 9+9,b=9 ->18
    }
    @Test
    /**
     * 两数交换
     * 1，给个中间变量
     * 2，先做加法运算，再做减法运算
     * 3，位运算
     */
    public void test2(){
        int a =10;
        int b=20;
        System.out.println("交换前：a="+a+",b="+b);
       //方式一：
        /*
        int tmp=0;
        tmp =a;
        a=b;
        b=tmp;*/
        //方式2：
       /* int s=a+b;
        a=s-a;
        b=s-a;
        */
      //  System.out.println("交换前：a="+a+",b="+b);
        //方式三：
        System.out.println("交换后：a="+(a<<1)+",b=" +(b>>1));



    }


}
