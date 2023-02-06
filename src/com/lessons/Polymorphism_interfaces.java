package com.lessons;
interface CoffeeCategories {
    void getExpresso();
    void getAmericano();
    void getBlackCofee();
}

interface Sandwiches {
    void cheeseSandwich();
    void vegSandwich();
    void paneerSandwich();
}

class CoffeeHouse implements CoffeeCategories, Sandwiches {


    @Override
    public void getExpresso() {
        System.out.println("This is an expresso");
    }

    @Override
    public void getAmericano() {
        System.out.println("This is Americano");
    }

    @Override
    public void getBlackCofee() {
        System.out.println("This is black Coffee");
    }

    @Override
    public void cheeseSandwich() {
        System.out.println("This a cheese Sanwich");
    }

    @Override
    public void vegSandwich() {
        System.out.println("This is a vegetable Sandwich");
    }

    @Override
    public void paneerSandwich() {
        System.out.println("This is a paneer sandwich");
    }
}


public class Polymorphism_interfaces {
    public static void main(String[] args) {
        CoffeeCategories coffee = new CoffeeHouse();
        // So here we have created an object of the interface but it will only give methods of CoffeeCategories and
        // not Sandwiches Interface. So this polymorphism which says one entity many forms. So here we are using one Class Coffeehouse for doing multiple things
        // i.e getting coffee from its interface and getting sandwiches. This is can also work, consider we have asked a person to order coffee and so he can only
        // order coffee and not sandwiches we can make sure. If we give him full Coffee house can order both Coffee and Sandwiches.

    }
}

