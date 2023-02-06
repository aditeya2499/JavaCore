package com.lessons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

interface X {
    void show(int i);
}

/*class Y implements X {
    *//*public void show(int x) {
        System.out.println("Showing Interface X");
    }*//*
}*/

public class JAVA8Features_Lambda {
    public static void main(String[] args) {
       X obj;
      /* obj = new X() //Anonymous Inner class
                    //Since this class does not have a name and it will be declared as $... in files
       {
           //This part of this code is called boiler plate code because we dont require all these things
           public void show(int x) {
               System.out.println("Showing interface X and i is "+x);
           }
       };*/
       obj = (i) -> System.out.println("Showing interface X and i is "+i);
       obj.show(8);

       //Usage of Lambda exp.
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);

        l1.forEach( (i) -> System.out.println(i) );

        //Using consumer interface to store a lambda expression
        List<Integer> l2 = Arrays.asList(6,7,8,9);

        Consumer<Integer> method = (i) -> System.out.println(i);
        l2.forEach(method);

    }
}
