package com.lessons;

import java.util.*;

public class Collections_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ArrayDeque<Integer> ad2 = new ArrayDeque<>();
        ad1.addFirst(1);
        ad1.add(2);
        ad1.add(3);
        ad1.addLast(4);

        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
    }
}
