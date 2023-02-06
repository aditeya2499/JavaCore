package com.lessons;

import java.util.Arrays;
import java.util.List;

public class JAVA8Features_forEachMethod {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1,2,3,4,5,6);
        //Now to print this list, intially till java 1.7 we were using for loops and enhanced for loops,
        /*for(int i=0;i<l1.size();i++) {
            System.out.println(l1.get(i));

        }
        for(int i:l1) {
            System.out.println(i);
        }*/

        // But from Java 8 we can use forEach method to print which is much faster than external loops
        l1.forEach(i -> System.out.println(i));
    }
}
