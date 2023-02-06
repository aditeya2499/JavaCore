package com.lessons;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Revision {
    public static void main(String[] args) {
     List<Integer> l1 = Arrays.asList(100,200,300,500);
        Stream<Integer> s2 = l1.stream();
        s2.filter(i -> i/10>0)
                .map(i -> i/10)
                .collect(Collectors.toList())
                .forEach(i -> System.out.println(i));

        HashMap<Integer,String> hm1 = new HashMap<>();
        hm1.put(1,"A");
        hm1.put(2,"B");
        hm1.put(3,"C");

        for(Map.Entry m:hm1.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }

        List<Integer> l2 = Arrays.asList(1,3,4,5,6,7,8,9);
        Stream<Integer> s1 = l2.stream();
        s1.filter(i -> i%2==0)
                .map(i -> i*2)
                .collect(Collectors.toList())
                .forEach(i -> System.out.println(i));
    }



}
