package com.lessons;

interface Speak {
    void sayHi();
    void sayBye();
}

class Mouth implements Speak {
    public void sayHi() {
        System.out.println("Hi My man, How are you");
    }
    public void sayBye() {
        System.out.println("GoodBye");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Mouth m1 = new Mouth();
        m1.sayHi();
        m1.sayBye();
    }
}
