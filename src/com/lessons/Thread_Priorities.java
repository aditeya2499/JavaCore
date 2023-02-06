package com.lessons;

class Threadd1 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while(i<30) {
            System.out.println("Thread 1 is running");
            i++;
        }
    }
}

class Threadd2 extends Thread {
    @Override
    public void run() {
        int i= 0;
        while(i<30) {
            System.out.println("Thread 2 is running");
            i++;
        }
    }
}

class Threadd3 extends Thread {
    @Override
    public void run() {
        int i= 0;
        while(i<30) {
            System.out.println("Thread 3 is running");
            i++;
        }
    }
}

public class Thread_Priorities {
    public static void main(String[] args) {
        Threadd1 t1 = new Threadd1();
        Threadd2 t2 = new Threadd2();
        Threadd3 t3 = new Threadd3();
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();

    }
}
