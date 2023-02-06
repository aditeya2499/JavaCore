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
    }

}
