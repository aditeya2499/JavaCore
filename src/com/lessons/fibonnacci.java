package com.lessons;

public class fibonnacci {

    public static void main(String[] args) {
        fibonnacci f1 = new fibonnacci();
        f1.printFibonacci(0,1,2);
    }

    public void printFibonacci(int val1, int val2, int l) {

        System.out.print(val1+" "+val2);
        printFibonacci(val2, val1+val2,--l);
    }

}

