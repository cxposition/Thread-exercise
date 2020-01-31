package com.com.AQS;

/**
 * @author cx
 * @Time 2020/1/31 20:39
 * @Description 默写复习冒泡排序
 */
public class Test {
    public static void main(String[] args)
    {
        int[] arr = {1,2,98,76,53};
        for (int i = 0; i < arr.length-1; i++)
        {
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
