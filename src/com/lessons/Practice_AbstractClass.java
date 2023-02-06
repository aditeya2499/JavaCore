package com.lessons;

abstract class Pen {
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen {

    @Override
    void write() {

    }

    @Override
    void refill() {

    }
    public void changeNib() {

    }
}
// Problem 3:
class Monkey {
    public void jump() {
        System.out.println("The Monkey is jumping");
    }
    public void Bite() {
        System.out.println("Bite");
    }
}

interface basicAnimal {
    void eat();
    void sleep();
}

class Human extends Monkey implements basicAnimal {

    @Override
    public void eat() {
        System.out.println("its time to eat");
    }

    @Override
    public void sleep() {
        System.out.println("Time to sleep");
    }
}
// Problem 6:

interface smartTvRemote {
    void channelChange();
    void shutDown();
}
interface tvRemote extends smartTvRemote {
    void volumeUp();
    void volumeDown();
}

class tv implements tvRemote {

    @Override
    public void channelChange() {

    }

    @Override
    public void shutDown() {

    }

    @Override
    public void volumeUp() {

    }

    @Override
    public void volumeDown() {

    }
}

public class Practice_AbstractClass {
    public static void main(String[] args) {
        Monkey m1 = new Human();
    }
}
