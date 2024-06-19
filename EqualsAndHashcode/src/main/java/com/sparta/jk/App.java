package com.sparta.jk;

public class App {
    public static void main(String[] args) {
        Spartan spartanOne = new Spartan("Manish", "G");
        Spartan spartanTwo = new Spartan("Manish", "G");

        System.out.println(spartanOne == spartanTwo);
        System.out.println(spartanOne.equals(spartanTwo));
    }
}
