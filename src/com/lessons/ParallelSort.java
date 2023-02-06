package com.lessons;

import java.util.Arrays;


public class ParallelSort {
    public static void main(String[] args) {
        int arr[] = new int[]{8, 4, 3, 5, 0};

        for (int i:arr
             ) {
            System.out.print(i);
            System.out.print(" ");
        }

        Arrays.parallelSort(arr);

        for (int i:arr
        ) {
            System.out.print(i);
            System.out.print(" ");
        }

        Arrays.parallelSort(arr,1,4);


    }
}
