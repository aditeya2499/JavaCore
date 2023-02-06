package com.lessons;

public class eroors {
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;
        try {
            int c = a/b;
            System.out.println(c);
        }
        catch (Exception e) {
            System.out.println("We failed to divide beacuse: ");
            System.out.println(e);
        }
    }
}
