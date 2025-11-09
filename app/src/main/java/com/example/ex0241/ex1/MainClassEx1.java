package com.example.ex0241.ex1;

public class MainClassEx1 {
    public static void main(String[] args){
        Chargeable[] electronics = new Chargeable[3];
        electronics[0] = (new Phone());
        electronics[1] = (new Tablet());
        electronics[2] = (new Laptop());
        for (Chargeable electronic : electronics){
            electronic.charge();
        }
    }
}
