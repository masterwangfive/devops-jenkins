package org.javase.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;


/**
 * 数组的练习
 */
public class Test01 {
    /**
     * 查询指定元素所在数组的下标位置
     */
    @Test
    public void test01(){
        int arr[] ={33,34,545,24,43,54,645,75};
        int num=75;
        int index =getIndex(arr,num);
        if(index==-1){
            System.out.println("元素不在数组中，没找到下标！");
        }else{
            System.out.println(index);
        }
    }


    /**
     * 给数组中新增元素
     */
    @Test
    public void test02(){
        int [] arr ={32,455,233,453,999};
        //            0 1    2   3  4
        //分析：给指定位置增加值，但是数组初始化之后就不能去改变其数组长度了，
        // 只能将插入位置的值往后移，那么最后一个位置的元素就被顶掉了。
        //arr[4]=arr[3];
        //arr[3]=arr[2];
        //arr[2]=444;   //指定位置增加的值
        System.out.println("增加前："+Arrays.toString(arr));
        //添加元素
        insertEle(arr,7,499);

        System.out.println("增加后："+Arrays.toString(arr));
    }

    /**
     * 删除元素
     */
    @Test
    public void test03(){

        int arr [] ={33,46,643,46,4633,235,323};
        //分析：删除指定位置的值，那么就是把后一个位置的值往前移，最后一个位置的值补0
        //删除操作
        //比如删除arr[2]的元素
        /*arr[2]=arr[3];
        arr[3]=arr[4];
        arr[4]=arr[5];
        arr[5]=arr[6];
        arr[6]=0;*/
        System.out.println("删除前元素："+Arrays.toString(arr));
        delEle(arr,46);
        System.out.println("删除后元素："+Arrays.toString(arr));
        Test01 t1=new Test01();
        
    }
    @Test
    public void test04(){
        long startTime =System.currentTimeMillis();
        for (int i = 0; i <100000 ; i++) {
            System.out.println(i);
        }
        long endTime=System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }

    /**
     * 删除数组中的元素
     * @param arr
     * @param num
     */
    public static void delEle(int arr[],int num){
        int index =-1; //删除的元素下标
        for(int i=0;i<arr.length;i++){
            if (arr[i]==num){
                index=i;
                break;
            }
        }

        if(index!=-1){
            for(int i=index;i<=arr.length-2;i++){
                arr[i]=arr[i+1];
            }
            arr[arr.length-1]=0;
        }else{
            System.out.println("没有您要删除的元素！");
        }

    }

    /**
     * 给数组增加元素
     * @param arr
     * @param index
     * @param num
     */
    public static void insertEle(int arr [],int index,int num){
       if(index>arr.length){
           System.out.println("你给的位置有问题，请检查！");
       }else{
            for(int i=arr.length-1;i<(index+1);i--){
                arr[i]=arr[i-1];
            }

            arr[index]=num;
       }
    }


    /**
     * 获取数组指定元素的下标
     * @param arr
     * @param num
     * @return
     */
    public static int getIndex(int []arr,int num){
        int index =-1;
        for(int i=0;i<arr.length;i++){
            if (arr[i]==num){
                index=i;
                break;
            }
        }
       return index;
    }


}
