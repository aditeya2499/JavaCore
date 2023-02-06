package com.lessons;

import java.util.*;

public class Collections_ArrayList {
    public static void main(String[] args) {
        //Array list is modified array which can be resized, new elements can be inserted and etc.
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        l1.add(0,1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);

        l2.add(6);
        l2.add(7);
        l2.add(8);

        // Merging of 2 Array List
        l1.addAll(0,l2);

        for(int i=0;i<l1.size();i++) {
            System.out.println(l1.get(i));
        }
        System.out.println("Do this array list contains 4?"+l1.contains(4));
        l1.indexOf(7);
        l1.lastIndexOf(2);
    }
}
