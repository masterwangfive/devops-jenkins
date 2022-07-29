package org.javase.sort;

public class BubbleSort {
    public static void main(String[] args) {
        int arrs[]={9,4,5,6,3,7,2,1,8};
        bubbleSort(arrs);
        System.out.println(" ");
        bubbleSort1(arrs);
    }


    public static void bubbleSort1(int arrs[]){
        for( int i=0;i<arrs.length-1;i++){
            for(int j=0;j<arrs.length-1-i;j++){
                if (arrs[j] >arrs[j+1]){        //如果当前值>后面的值，那么就把前后位置的值进行交换
                    swap_(arrs,j,j+1);
                }
            }
        }
        for(int i=0;i<arrs.length;i++){
            System.out.print(arrs[i]+" ");
        }
    }

    public static void bubbleSort(int arrs []){
        if (arrs==null || arrs.length<=2){
            return;
        }
        for(int i =arrs.length-1;i>0;i--){     //从后往前遍历

            for(int j =0;j<i;j++){ //从前往后遍历
                if (arrs[j] >arrs[j+1]){        //如果当前值>后面的值，那么就把前后位置的值进行交换
                    swap_(arrs,j,j+1);
                }
            }
        }
        for(int i=0;i<arrs.length;i++){
            System.out.print(arrs[i]+" ");
        }
    }
    public static void swap_(int [] ares ,int a ,int b){
        ares[a]=ares[a]^ares[b];
        ares[b]=ares[a]^ares[b];
        ares[a]=ares[a]^ares[b];

    }
}
