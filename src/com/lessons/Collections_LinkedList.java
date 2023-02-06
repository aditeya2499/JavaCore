package com.lessons;

import java.util.LinkedList;

public class Collections_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l1.add(0,1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);

        l2.add(6);
        l2.add(7);
        l2.add(8);


        l1.addFirst(2000);
        l1.addLast(3000);

        l1.addAll(l2);

        for(int i=0;i<l1.size();i++) {
            System.out.println(l1.get(i));
        }
    }
}
