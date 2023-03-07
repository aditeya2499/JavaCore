package com.lessons;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int arr[] = new int[4];
            arr[0] = 10;
            arr[1] = 20;
            arr[2] = 30;
            arr[3] = 40;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Index you want to divide:");
            int ind = sc.nextInt();
            System.out.println("Enter the number with which you want to divide:");
            int num = sc.nextInt();
            System.out.println("The number at the selected index is "+arr[ind]);
            System.out.println("The division result is "+arr[ind]/num);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Problem is there");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of Bounds of the array, Please enter correct Index");
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println("Some other exception occured");
        }
    }
}
