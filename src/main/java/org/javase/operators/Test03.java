package org.javase.operators;

import org.junit.jupiter.api.Test;

/**
 * 循环练习
 */
public class Test03 {
    @Test
    /**
     * 打印9*9乘法表
     */
    public void test01(){
        for(int i=1;i<=9;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+i*j+"\t");
            }
            System.out.println();
        }
    }
    @Test
    public void test02(){
        for(int i=9;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+i*j+"\t");
            }
            System.out.println();
        }
    }
}
