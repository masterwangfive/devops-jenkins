package org.javase.sort;

/**
 * 插入排序
 * 把一个数插入到数组的一个位置，还是两两比较
 * 如果前面的数小就放在前面
 */
public class InsertSort {
    public static void main(String[] args) {
        int arrs[]={9,4,5,6,3,7,2,1,8};
        insertSort(arrs);
        printArrs(arrs);
    }
    public static void insertSort(int []arrs){
        for(int i=1;i<arrs.length;i++){
            for(int j=i; j>0;j--){
                if(arrs[j]<arrs[j-1]){
                    swap_(arrs,j,j-1);
                }
            }
        }

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
