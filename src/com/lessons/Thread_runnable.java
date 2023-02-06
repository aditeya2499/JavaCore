package com.lessons;

class t1 implements Runnable {
    public void run() {
        int i=0;
        while(i<4000) {
            System.out.println("t1 running");
            i++;
        }
    }
}

class t2 implements Runnable {
    public void run() {
        int i=0;
        while(i<4000) {
            System.out.println("t2 running");
            i++;
        }
    }
}

public class Thread_runnable {
    public static void main(String[] args) {
        t1 thread1 = new t1();
        t2 thread2 = new t2();
        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        t1.start();
        t2.start();
    }


}
