package com.lessons;

import java.io.*;

class Students implements Serializable {
    private String name;
    private int rollNo;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Students(String name, int rollNo) {
        this.name=name;
        this.rollNo=rollNo;
    }
}
public class Serialization {
    public static void main(String[] args) {
        Students s1 = new Students("Aditeya", 1);

        try {
            FileOutputStream fileout = new FileOutputStream("/Users/aditeyashukla/IdeaProjects/Java_lessons/src/com/files/Serialized.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileout);
            out.writeObject(s1);
            out.close();//closing object output stream
            fileout.close();//closing file output stream
            System.out.println("Serialized data stored in Serialized.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
