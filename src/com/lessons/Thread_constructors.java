package com.lessons;

class Thr extends Thread {
    public Thr(String name) {
        super(name);
    }
    @Override
    public void run() {
        int i=0;
        while(i<400) {
            System.out.println("t1");
            i++;
        }
    }
}

public class Thread_constructors {
    public static void main(String[] args) {
        Thr t1 = new Thr("My Thread");
        t1.start();
        System.out.println(t1.getName());
    }
}
