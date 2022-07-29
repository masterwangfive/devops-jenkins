package org.javase.Interview;

/**
 * 输出1-100内的所有质数
 * 素数/质数   能被1和自己整除的数都是素数
 * 注意：所有数都能被1和自己整除的，所以要判断除了自己以外的其他数是不是素数
 * 思路：
 *   2 是数素，那么就从3开始
 *   3：3%2！=0  没有数了，继续下一个
 *   4：4%2==0 ，满足条件，break
 *   5：5%2！=0，5%3！=0，5%4！=0
 *   规律：需要两层循环，外层循环从3开始，内层循环从2开始，到外层循环数-1结束。
 */
public class PrimeNumber {
    public static void main(String[] args) {
        isPrimeNumber();
        //isPrimeNo(2,100);
    }
    public static void isPrimeNumber(){
        for(int i=2;i<=100;i++){
            for(int j=2;j<=i;j++){
                if(i%j==0){
                    break;
                }else {
                    if(j==i-1){
                        System.out.println("素数："+i);
                    }
                }
            }
        }
    }

    /**
     * 方式2
     * @param a
     * @param b
     */
    public static void isPrimeNo(int a,int b){

        for (int i = a; i <=b; i++) {
            boolean flag =false;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    flag=true;
                    break;
                }
            }
            if(!flag){
                System.out.println("素数："+i);
            }

        }
    }


}
