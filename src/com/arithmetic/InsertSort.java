package com.arithmetic;

/**
 * @author cx
 * @Time 2020/2/1 22:04
 * @Description 插入排序算法实现
 */
public class InsertSort {
    public static void insertSort(int[] array)
    {
        /**外循环遍历无须序列*/
        for (int j = 1; j < array.length; j++)
        {
            /**第一步保存待插入元素的数值*/
            int temp = array[j];
            int i = j-1;
            /**内循环遍历有序序列*/
            for (; i >= 0 && temp < array[i] ; i--)
            {
                array[i+1] = array[i];
            }
            array[i+1] = temp;
        }
    }
    public static void main(String[] args)
    {
        int[] a = {9,1,38,23,56,10,189,47,25,100};
        insertSort(a);
        for (int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }
    }
}
