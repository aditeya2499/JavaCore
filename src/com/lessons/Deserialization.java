package com.lessons;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Students s1 = null;
        try {
            FileInputStream fin = new FileInputStream("/Users/aditeyashukla/IdeaProjects/Java_lessons/src/com/files/Serialized.txt");
            ObjectInputStream oin = new ObjectInputStream(fin);
            s1 = (Students) oin.readObject();
            oin.close();
            fin.close();
        }
        finally {
            System.out.println("Deserialization done");
            System.out.println("Name is "+s1.getName());
            System.out.println("Roll No is "+s1.getRollNo());
        }
    }
}
