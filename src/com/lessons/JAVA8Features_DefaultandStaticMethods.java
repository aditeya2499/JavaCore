package com.lessons;

interface I {
    void show(); // before Java 1.8 we were having only abstract methods
    default void run() {
        System.out.println("default method running"); // no need to declare in class implemnting interface introduced since Java 8
    }
}

class C implements I {

    @Override
    public void show() {
        System.out.println("Showing");
    }
}
public class JAVA8Features_DefaultandStaticMethods {
    public static void main(String[] args) {
        C a = new C();
        a.show();
        a.run();

    }
}
