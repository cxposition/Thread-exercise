package com.arithmetic;

/**
 * @author cx
 * @Time 2020/1/31 21:15
 * @Description 选择排序
 */
public class SelectionSort {
//    static Example em = new Example();
//    public  void sort(Comparable[] a)
//    {
//        int N = a.length;
//        for (int i = 0; i < N; i++)
//        {
//            int min = i;
//            for (int j = i+1; j < N; j++)
//            {
//                if(em.less(a[j],a[min]))
//                    min = j;
//            }
//            em.exch(a,i,min);
//        }
//    }
    public static void main(String[] args)
    {
//        Comparable a[] = [1,34,52,98,67];
//        sort(a);
//        if (em.isSorted(a))
//            em.show(a);
        int[] arr = {2,18,97,15,24,20};
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i+1; j < arr.length; j++)
            {
                int min = i;
                if(arr[j]<arr[min])
                {
                    min = j;
                }
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;

            }
        }
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }

    }


}
