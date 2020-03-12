package com.arithmetic;

/**
 * @author cx
 * @Time 2020/1/31 20:39
 * @Description 默写复习冒泡排序
 */
public class Bubbling {
    public static void main(String[] args)
    {
        int[] arr = {1,2,98,76,53};
        /**冒泡的趟数*/
        for (int i = 0; i < arr.length-1; i++)
        {   /**冒泡当中元素比较次数，受冒泡趟数影响*/
            for (int j = 0; j < arr.length-1-i; j++)
            {
                int temp = 0;
                if (arr[j] < arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
        for (int i = 0; i < arr.length ; i++)
        {
            System.out.println(arr[i]);
        }
        return;
    }
}
