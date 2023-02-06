package com.lessons;

import java.util.Scanner;

abstract class Shape {
    public Shape() {
        System.out.println("I am the constructor of Parent 1");
    }
    public abstract void getArea();
    public abstract void getPerimeter();
}

class Circle extends Shape {
    @Override
    public void getArea() {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println(3.14*(r*r));
    }

    @Override
    public void getPerimeter() {

    }
}

public class Abtract_class {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.getArea();
    }
}
