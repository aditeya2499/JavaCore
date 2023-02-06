package com.lessons;

class Thread1 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while(i<30) {
            System.out.println("Thread 1 is running");
            i++;
        }
    }
}

class Thread2 extends Thread {
    @Override
    public void run() {
        int i= 0;
        while(i<30) {
            System.out.println("Thread 2 is running");
            i++;
        }
    }
}

public class Thread_class {

    // In threading both the functions are running simultaneously and without threading the functions are executed one by one only.
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
    }
}
