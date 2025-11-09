package com.example.ex0241.ex2;

public class Piano implements Playable {
    @Override
    public void play() {
        System.out.println("You play the piano");
    }
    public void playPianoChord() {
        System.out.println("Playing a chord on the piano");
    }

    public void pressPianoKey() {
        System.out.println("Pressing a piano key");
    }
}
