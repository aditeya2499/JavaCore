package com.lessons;

import org.w3c.dom.ls.LSOutput;

interface D {
    default void show() {
        System.out.println("Showing D");
    }
}

interface E {
    default void show() {
        System.out.println("Showing E");
    }
}

class F implements D, E {

    @Override// So to solve Diamond problem we need to again override the show method in the class implementing interface with same methods
    //IF we will comment out this method, this class will give ambiguity error
    public void show() {

    }
}

public class DiamondProblem {

}
