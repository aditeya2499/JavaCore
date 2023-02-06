package com.lessons;

interface Gps {
    void showLocation();
    void showCoordinates();
}
interface Camera  {
    void takePhoto();
    void takeVideo();
    // Use of Private and Default:
    private void take4kVideo() {
        System.out.println("Taking a 4k video");
    }
    // creating a default method
    default void takeSlowMoVideo() {
        take4kVideo();
        System.out.println("Taking slow mo in 4k");
    }
}
interface MediaPlayer {
    void playMusic();
    void playVideo();
    default void showLyrics() {
        System.out.println("Showing lyrics"); // So here we have added some implementation in thi default method but we can always override it while creating in the class
        // See example  below: // and also default methods does not needs to be implemented in every class using the interface
    }; /// IF we dont declare this method default, it will throw an error and ask us to implement in the class
}

class Cellphone implements Gps, Camera, MediaPlayer {

    @Override
    public void showLocation() {
        System.out.println("The location is Lucknow");
    }

    @Override
    public void showCoordinates() {
        System.out.println("The Coordinates are 1;1;1");
    }

    @Override
    public void takePhoto() {
        System.out.println("Taking a Photo");
    }

    @Override
    public void takeVideo() {
        System.out.println("Taking a video");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing Music");
    }

    @Override
    public void playVideo() {
        System.out.println("Playing Video");
    }
    @Override
    public void showLyrics() {
        System.out.println("Showing some custom lyrics"); // here we have modified or overide our default method
    }

}
public class Inheritance_example {
    public static void main(String[] args) {
        Cellphone c1 = new Cellphone();
        c1.showLocation();
        c1.showCoordinates();
        c1.takePhoto();
        c1.takeVideo();
        c1.playMusic();
        c1.showLyrics();
        c1.takeSlowMoVideo();
    }
}
