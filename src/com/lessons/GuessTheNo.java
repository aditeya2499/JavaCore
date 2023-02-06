package com.lessons;

import java.util.Random;
import java.util.Scanner;

class Game {
    int noOfGuesses;
    int userInput;
    int randomNo;

    public Game() {
        Random r = new Random();
        this.randomNo = r.nextInt(3);
    }
    public void takeUserInput() {
        Scanner sc = new Scanner(System.in);
        this.userInput = sc.nextInt();
    }

    public void isCorrectNumber() {
        if(randomNo==userInput) {
            System.out.println("Your guess is correct");
        }
        else {
            System.out.println("Your guess is wrong");
        }
    }
    public int getNoOfGuesses() {
        return noOfGuesses;
    }
    public void setNoOfGuesses() {
        Scanner sc = new Scanner(System.in);
        this.noOfGuesses = sc.nextInt();
    }
}
public class GuessTheNo {
    public static void main(String[] args) {
        Game p1 = new Game();
        p1.setNoOfGuesses();
        System.out.println(p1.getNoOfGuesses());
        for(int i=0;i<p1.getNoOfGuesses();i++) {
            p1.takeUserInput();
            p1.isCorrectNumber();
            System.out.println(p1.randomNo);
        }

    }
}
