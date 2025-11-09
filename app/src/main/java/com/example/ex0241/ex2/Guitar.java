package com.example.ex0241.ex2;

public class Guitar implements Playable {
    @Override
    public void play() {
        System.out.println("You play the guitar");
    }
    public void strumGuitar() {
        System.out.println("Strumming the guitar strings");
    }

    public void pluckGuitar() {
        System.out.println("Plucking a single guitar string");
    }
}
