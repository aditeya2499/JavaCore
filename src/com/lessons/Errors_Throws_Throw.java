package com.lessons;

class NegativeAreaException extends Exception {
    @Override
    public String toString() {
        return getMessage();
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative!";
    }
}

public class Errors_Throws_Throw {
    public static double area(double r) throws NegativeAreaException {
        if(r<0) {
            throw new NegativeAreaException();
        }
        return Math.PI*r*r;
    }

    public static void main(String[] args) {
        try {
            double a = area(-9);
            System.out.println(a);
        } catch (NegativeAreaException e) {
            System.out.println(e);
        }
    }
}
