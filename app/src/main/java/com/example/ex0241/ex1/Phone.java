package com.example.ex0241.ex1;

public class Phone implements Chargeable {
    @Override
    public void charge() {
        System.out.println("The phone is charging");
    }
    public void makeCall() {
        System.out.println("Calling a contact");
    }

    public void sendText() {
        System.out.println("Sending a text message");
    }

}
