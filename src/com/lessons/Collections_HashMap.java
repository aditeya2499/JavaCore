package com.lessons;

import java.util.HashMap;
import java.util.Map;

public class Collections_HashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> m1 = new HashMap<>();
        m1.put(1,"IntelliJ");
        m1.put(2,"VisualStudio");
        m1.put(3,"Eclipse");

        for(Map.Entry m:m1.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
