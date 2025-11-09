package com.example.ex0241.ex2;

public class Drum implements Playable {
    @Override
    public void play() {
        System.out.println("You play the drum");
    }
    public void hitDrum() {
        System.out.println("Hitting the drum.");
    }

    public void rollDrum() {
        System.out.println("Performing a drum roll.");
    }
}
