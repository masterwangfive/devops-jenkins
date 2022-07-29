package org.javase.sort;

/**
 * 快速排序
 * 思路：
 * 1，找到一个基准值
 * 2，然后定义2个索引，左边和右边
 * 3，当两个索引值不想等的时候循环遍历，让右边索引往左移，左边索引往右移
 * 4，然后交换这两个索引的位置，如此循环就能把左右的数组都排好序，然后再进行递归把两边排好序的数组拼接一起
 */
public class QuickSort {

    public static void main(String[] args) {
        int arrs[]={9,4,5,6,3,7,2,1,8};
        quick(arrs,0,arrs.length-1);
        printArrs(arrs);
    }

    public static void quick(int [] arrs,int left,int right){
        if(left>right){
            return;
        }
        int base=arrs[left]; //找个基准值
        int i=left;
        int j=right;
        while (i!=j){
            while (arrs[j]>=base && i<j){
                j--;
            }
            while (arrs[i]<=base && i<j){
                i++;
            }

            swap_(arrs,i,j);
        }
        //左右两个指针相遇，将相遇的值和base进行交换
       // arrs[i]=arrs[j];
        //arrs[j]=arrs[base];
        //将基准数左边的数，继续递归调用
        quick(arrs,left,j);
        quick(arrs,j+1,right);

    }

    public static void swap_(int [] ares ,int a ,int b){
        ares[a]=ares[a]^ares[b];
        ares[b]=ares[a]^ares[b];
        ares[a]=ares[a]^ares[b];

    }

    public static void printArrs(int arrs[]){
        for(int i=0;i<arrs.length;i++){
            System.out.print(arrs[i]+" ");
        }
    }
}
