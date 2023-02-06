package com.lessons;

class Parent {
    int a;
    int b;

    Parent() {
        System.out.println("I am the constructor of Parent class without parameters");
    }
    Parent(int x) {
        System.out.println("I am the constructor of parent class with value of x as "+ x);
    }

}

class Child1 extends Parent{
    Child1() {
        System.out.println("I am the constructor of child1 without param");
    }
    Child1(int x, int y) {
        super(x);
        System.out.println("I am the constructor of Child1 with y as " + y);
    }
}

class Child2 extends Child1 {
    public Child2 () {
        System.out.println("I am the constructor of child1 without param");
    }
    public Child2(int x, int y, int z) {
        super(x,y);
        System.out.println("I am the constructor of Child1 with y as " + z);
    }
}


public class Constructors_Inheritance {
    public static void main(String[] args) {
        Child2 c2  = new Child2(1,2,3);
    }
}
