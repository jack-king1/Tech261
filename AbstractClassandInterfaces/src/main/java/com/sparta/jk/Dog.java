package com.sparta.jk;

public class Dog extends Animal implements Drinkable{
    private String name;
    private String breed;
    private int age;

    public Dog(String name, int age, String breed) {
        super(name, age, breed);
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating!");
    }

    //overloading
    //1. Return type
    //2. type of parameters
    //3. OR order of parameters

    public void play(String name){
        System.out.println(name + " wants to play with " + super.getName() +"!");
    }

    @Override
    public void Drink() {

    }

    @Override
    public void print() {
        Drinkable.super.print();
    }

    @Override
    public void goToSleep() {

    }
}
