package com.sparta.jk;

public class App {
    public static void main(String[] args) {
        Spartan spartanOne = new Spartan("Manish", "G");
        Spartan spartanTwo = new Spartan("Manish", "G");

        System.out.println("Spartan 1: " + spartanOne.hashCode());
        System.out.println("Spartan 2: " + spartanTwo.hashCode());
        System.out.println(spartanOne == spartanTwo);
        System.out.println(spartanOne.equals(spartanTwo));

    }
}
