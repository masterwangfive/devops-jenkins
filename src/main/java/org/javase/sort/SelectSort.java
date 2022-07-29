package org.javase.sort;


public class SelectSort {
    /**
     * 选择排序
     * 思路：
     * 定义一个变量设置这个变量就是最小的索引
     * 第一层循环 从i -- length-1开始遍历
     * 第二次循环，从 i+1 -- length 开始遍历
     * 判断 找到最小值的索引
     * 然后对索引对应的值再进行交换
     */
    public static void selectSort(int arrs[]){
        for(int i =0;i<arrs.length-1;i++){          //i～ N-1
            int index =i;
            for(int j=i+1;j<arrs.length;j++){
                index = arrs[j]< arrs[index] ? j: index; //i~ N-1位置上找最小值的下标
                swap(arrs,i,index);   //每次都是i位置跟最小位置进行交换，这样就可以排序了
            }

        }

    }
    public static void swap(int [] ares ,int a ,int b){
        int temp =ares[a];
        ares[a]=ares[b];
        ares[b]=ares[temp];
    }

    public static void main(String[] args) {
        selectSort1();
    }

    public static void selectSort1(){
        int arrs[]={3,4,6,8,9,1,2,5,7};
       // System.out.println(arrs.length-1);
        if(arrs.length!=0){
            for(int j=0;j<=arrs.length-1;j++){
                int minPos=j;
                //找出最小的下标
                for(int i=j+1;i<=arrs.length-1;i++){
                    if(arrs[i]<arrs[minPos]){
                        minPos=i;
                        System.out.println(minPos);
                    }
                }
                //用最小下标的值来交换
                int tmp =arrs[minPos];
                arrs[minPos]=arrs[j];
                arrs[j]=tmp;

            }

        }
        for(int i=0;i<arrs.length;i++){
            System.out.print(arrs[i]+" ");
        }
    }



}
