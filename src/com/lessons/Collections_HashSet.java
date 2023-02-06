package com.lessons;

import java.util.HashSet;

public class Collections_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>(12,09f);
        myHashSet.add(1);
        myHashSet.add(2);
        myHashSet.add(2);
        myHashSet.add(2);
        myHashSet.add(3);
        System.out.println(myHashSet);
    }
}
