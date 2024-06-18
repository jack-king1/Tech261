package com.sparta.jk;

public class Dog extends Animal{
    private String name;
    private String breed;
    private int age;

    public Dog(String name, int age, String breed) {
        super(name, age, breed);
    }

    //overloading
    //1. Return type
    //2. type of parameters
    //3. OR order of parameters

    public void play(String name){
        System.out.println(name + " wants to play with " + super.getName() +"!");
    }
}
