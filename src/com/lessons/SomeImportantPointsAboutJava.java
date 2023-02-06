package com.lessons;

import java.util.Scanner;

class ThreadOne extends Thread {
    @Override
    public void run() {
        int i=0;
        while(i<400) {
            System.out.print("t1");
            i++;
        }

    }
}

class ThreadTwo extends Thread {
    @Override
    public void run() {
        int i=0;
        while(i<400) {
            System.out.print("t2");
            i++;
        }

    }
}


public class SomeImportantPointsAboutJava {
    //public static void main(String[] args) {
//       ThreadOne t1 = new ThreadOne();
//       t1.setPriority(Thread.MAX_PRIORITY);
//       ThreadTwo t2 = new ThreadTwo();
//       t2.setPriority(Thread.MIN_PRIORITY);
//       t1.start();
//       t2.start();

       // Java is not pure object oriented programming language because it has access to primitive data types such as int, boolean,
        // char etc which does not belong to any Class. For e.g. String belongs to a class String but these primitive datatypes does
        // not belong to any class.
        public static void main(String args[]) {
            try {
                int n = 1000, x = 0;
                int arr[] = new int[n];
                for (int i = 0; i <= n; i++) {
                    arr[i] = i / x;
                }
            }
            catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println("1st block = ArrayIndexOutOfBoundsException");
            }
            catch (ArithmeticException exception) {
                System.out.println("2nd block = ArithmeticException");
            }
            catch (Exception exception) {
                System.out.println("3rd block = Exception");
            }
            // Concept of Copy Constructors:Copy Constructor is the constructor used when we want to initialize the value to the new object from
            // the old object of the same class.
            /*class InterviewBit{
                String department;
                String service;
                InterviewBit(InterviewBit ib){
                    this.departments = ib.departments;
                    this.services = ib.services;
                }
            }*/

            //Finally: It is the block present in a program where all the codes written inside it get executed irrespective of handling of exceptions. Example:

            try {
                int variable = 5;
            }
            catch (Exception exception) {
                System.out.println("Exception occurred");
            }
            finally {
                System.out.println("Execution of finally block");
            }

            //Finalize: Prior to the garbage collection of an object, the finalize method is called so that the clean-up activity is implemented. Example:

           /* public static void main(String[] args) {
                String example = new String("InterviewBit");
                example = null;
                System.gc(); // Garbage collector called
            }
            public void finalize() {
            // Finalize called
            }*/

        }
    }

