package com.example.ex0241.ex1;

public class Tablet implements Chargeable {
    @Override
    public void charge() {
        System.out.println("The tablet is charging");
    }
    public void useStylus() {
        System.out.println("Using stylus");
    }

    public void splitScreenMultitasking() {
        System.out.println("Using two apps at the same time");
    }


}
