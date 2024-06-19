package com.sparta.jk;

public class Cat extends Animal{
    public Cat(String name, int age, String breed) {
        super(name, age, breed);
    }

    @Override
    public void play() {
        System.out.println(super.getName() + " is not in the mood to play with silly human...");
    }

    @Override
    public void eat() {
        System.out.println("Im eating cat food!");
    }

    public void climb(){
        System.out.println("cat is climbing?");
    }
}
