package com.lessons;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        System.out.println("Enter the index");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        try {
            System.out.println("The value at this index is:" + arr[n]);
            try {
                System.out.println("Please enter correct index value");
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println();
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }


    }

}
