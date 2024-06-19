package com.sparta.jk;

public interface Drinkable extends Sleepable {
    int max = 10; //constant and final
    void Drink();

    default void print(){
        printFromInterface();
    }

    private static void printFromInterface(){
        System.out.println("I am printing from an interface");
    }

    public static void doSomething(){
        System.out.println("Static method");
    }
}
