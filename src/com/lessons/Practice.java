package com.lessons;

import java.util.Scanner;

class Cricket {
   int runs = 200;
   String bat = "GM";
   String ball = "leather";
}

class Employee {
    int Salary;
    String name;

    public Employee() {
        this.Salary = 1000;
    }

    public void getSalary() {
        System.out.println(Salary);
    }
    public void getName() {
        System.out.println(name);
    }
    public void setName(String newname) {
        name = newname;
    }
}

class Rectangle {
    int l;
    int b;
    public void setL(int le) {
        l = le;
    }
    public void setB(int B) {
        b = B;
    }
    public void getArea() {
        System.out.println(l*b);
    }
    public int getPerimiter() {
        return 2*(l+b) ;
    }
}

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Revise OOPS
        Employee e1 = new Employee();
        e1.getSalary();
        }


        }

