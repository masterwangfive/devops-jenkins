package org.javase.operators;

import org.junit.jupiter.api.Test;

/**
 * 打印形状
 */
public class Test04 {
    @Test
    /**
     * 打印正方形 5*5
     * *****
     * *****
     * *****
     * *****
     * *****
     */
    public void test01(){
        for (int i=5;i>=1;i--){
            for(int j=1;j<=5;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    /**
     * 打印平行四边形
     *          * * * * * * * *
     *         * * * * * * * *
     *        * * * * * * * *
     *       * * * * * * * *
     */
    @Test
    public void test05(){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=9-i;j++){   //控制空格数
                System.out.print(" ");
            }
            for (int j=1;j<=8;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    @Test
    /**
     * 打印三角形                  星星数的规律           空格数的规律
     *         *               1->1  1*2-1 =1            1->9    (9-1)*2 =16
     *       * * *             2->3  2*2-1=3             2->7    (9-2)*2= 14
     *     * * * * *           3->5  3*2-1=5             3->5    (9-3)*2= 12
     *   * * * * * * *         4->7  4*2-1=7             4->3    (9-4)*2= 10
     * * * * * * * * * *       5->9  5*2-1=9             5->1    (9-5)*2= 8
     */
    public void test02(){

       /* 方式一：
       for(int i=1;i<=5;i++){
            for(int j=1;j<=(9-i)*2;j++){  //控制空格数量
                System.out.print(" ");
            }
            for(int j=1;j<=(i*2-1);j++){ //控制🌟的数量
                System.out.print("* ");
            }

            System.out.println();

        }*/
        /*
        * 方式2：
        *   * 打印三角形            行数   星星数
         *         *               1----->1     1*2-1=1
         *       * * *             2----->3     2*2-1=3
         *     * * * * *           3----->5     3*2-1=5
         *   * * * * * * *         4----->7     4*2-1=7
         * * * * * * * * * *       5----->9     5*2-1=9
         *
        * */
        for(int i=1;i<=5;i++){
            for(int j=1;j<=9-i;j++){   //空格
                System.out.print(" ");
            }
            for(int j=1;j<=(i*2-1);j++){ //星星
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /**
     * 打印菱形
     *         *
     *       * * *
     *     * * * * *
     *   * * * * * * *
     * * * * * * * * * *        行数             星星数      空格数
     *  * * * * * * * *          1  1*2+7=9        7    1+8         9
     *    * * * * *              2  2*2+5=9        5    2+8         11
     *      * * *                3  3*2+3=9        3    3+8         13
     *        *                  4  4*2+1=9        1    4+8         15
     */
    @Test
    public void test03(){
        //上半部分
        for(int i=1;i<=5;i++){              //行数
            for(int j=1;j<=(9-i);j++){  //控制空格数量
                System.out.print(" ");
            }
            for(int j=1;j<=(i*2-1);j++){ //控制🌟的数量
                System.out.print("*");
            }

            System.out.println();

        }
        //下班部分
        for(int j=1;j<=4;j++){    //行数

            for(int i=1;i<=(4+j);i++){
                System.out.print(" ");
            }
            for(int i=1;i<=9-2*j;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * 打印空心菱形
     *        *
     *      *   *
     *    *       *
     *  *           *
     * *             *
     *   *          *
     *    *       *
     *      *   *
     *        *
     */
    @Test
    public void test04(){
        //上半部分
        for(int i=1;i<=5;i++){              //行数
            for(int j=1;j<=(9-i);j++){  //控制空格数量
                System.out.print(" ");
            }
            for(int j=1;j<=(i*2-1);j++){ //控制🌟的数量
                if(j==1|| j==(i*2-1)){
                    System.out.print("*");  //控制打印几个星
                }else {
                    System.out.print(" ");
                }
            }

            System.out.println();

        }
        //下班部分
        for(int j=1;j<=4;j++){    //行数

            for(int i=1;i<=(4+j);i++){
                System.out.print(" ");
            }
            for(int i=1;i<=9-2*j;i++){
                if(i==1|| i==(9-2*j)){
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    /**
     * 打印菱形的另一种实现方式
     * 先打印出一个正方式，然后在某些位置打印* ，某些位置打印空
     */
    @Test
    public void test06(){    // * * * * * * *
        int size =7;
        int startNum=size/2+1;
        int endNum=size/2+1;
        //引入一个boolean 理解为开关
        boolean flag=true;
        for(int i=1;i<=size;i++){
            for(int j=1;j<=size;j++){
                if(j>=startNum && j<=endNum) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }

            }

            System.out.println();
            if(endNum==size){
                flag=false;
            }
            if(flag){   //flag 是true表示是菱形的上一部分，false 表示是下半部分
                startNum--;
                endNum++;
            }else{
                startNum++;
                endNum--;
            }

        }
    }
    /**
     * 打印空心菱形
     * 先打印出一个正方式，然后在某些位置打印* ，某些位置打印空
     */
    @Test
    public void test07(){    // * * * * * * *
        int size =7;
        int startNum=size/2+1;
        int endNum=size/2+1;
        //引入一个boolean 理解为开关
        boolean flag=true;
        for(int i=1;i<=size;i++){
            for(int j=1;j<=size;j++){
                if(j==startNum || j==endNum) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }

            }

            System.out.println();
            if(endNum==size){
                flag=false;
            }
            if(flag){   //flag 是true表示是菱形的上一部分，false 表示是下半部分
                startNum--;
                endNum++;
            }else{
                startNum++;
                endNum--;
            }

        }
    }


}
