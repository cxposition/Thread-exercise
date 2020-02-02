package com.arithmetic;

/**
 * @author cx
 * @Time 2020/2/2 20:17
 * @Description 实现希尔排序算法
 * 希尔排序是一种特殊的插入排序，希尔排序会将数组元素不断分组，分完组后对组内元素进行插入排序
 * 学好插入排序后对希尔排序很容易理解。
 */
public class ShellSort {
    private static void insertI(int[] arr,int gap,int i)
    {
        int inserted = arr[i];
        int j;
        /**插入的时候按组进行插入（组内元素两两相隔gap）*/
        for (j = i-gap; j >= 0&&inserted < arr[j] ; j -= gap)
        {
            arr[j+gap] = arr[j];
        }
        arr[j+gap] = inserted;
    }
    private static void sort(int[] arr)
    {
        int N = arr.length;
        /**进行分组，最开始的增量gap为数组长度的一半*/
        for (int gap = N/2; gap > 0; gap /= 2)
        {
            for (int i = gap; i < N; i++)
            {
                insertI(arr,gap,i);
            }
        }
    }

    private static void SysOut(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] a = {1,98,26,20,58,60};
        sort(a);
        SysOut(a);
    }
}
