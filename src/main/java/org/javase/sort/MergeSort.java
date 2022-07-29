package org.javase.sort;

/**
 * 归并排序
 */
public class MergeSort {
    public static void main(String[] args) {
        int arrs[]={9,3,5,6,2,4,7,1,8};
       // merge(arrs);
      //  printArrs(arrs);
        //merge1(arrs,0,arrs.length);
        sort(arrs,0,arrs.length-1);
    }


    public static void sort(int arrs[],int left,int right){
        int mid=left+(right-left)/2;
        sort(arrs,left,mid);
        sort(arrs,mid+1,right);
        merge(arrs,left,mid+1,right);
    }
    /**
     *
     * @param arrs
     * @param leftPtr 左指针
     * @param rightPtr 右指针
     * @param rightBound 右边界
     */
    public static void merge(int arrs[],int leftPtr,int rightPtr,int rightBound){
        int mid=rightPtr-1;
        int temp [] =new int[rightBound-leftPtr+1];
        int i=leftPtr;  //左边起始索引
        int j=rightPtr; //右边起始索引
        int k=0;  //存放temp的数组索引
        while (i <=mid && j<=rightBound){
            temp[k++]= arrs[i]<=arrs[j] ? arrs[i++]: arrs[j++];
           /* if(arrs[i]<= arrs[j]){
                temp[k++]=arrs[i++];
               // i++;
                //k++;
                //swap_(temp,i,j);
            }else{
                temp[k++]=arrs[j++];

            }*/
        }
        while (i<=mid) temp[k++]=arrs[i++];
        while (j<rightBound) temp[k++]=arrs[j++];

        for(int m=0;m<arrs.length;m++){
            arrs[leftPtr+m] =temp[m];
        }
        //printArrs(temp);
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
    static int markNum=0;
    public static void merge1(int arrs[],int beginIndex,int endIndex){

        if(!(beginIndex<endIndex)){
            return;
        }
        int mid=beginIndex+endIndex/2;
        // merge1(arrs,beginIndex,mid);
        //merge1(arrs,mid+1,endIndex);
        for (int i=beginIndex+1;i<endIndex;i++){
            for(int j=beginIndex;j<i;j++){
                if(arrs[i]<arrs[j]){
                    swap_(arrs,i,j);

                    markNum++;
                    System.out.println("markNum="+markNum);
                }
            }
        }
        printArrs(arrs);
    }
}
