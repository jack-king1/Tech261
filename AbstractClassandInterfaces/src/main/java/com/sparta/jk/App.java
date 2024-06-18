package com.sparta.jk;

public class App {
    public static void main(String[] args) {
        Dog myDog = new Dog("Lilly", 12, "Cockapoo");
        Cat myCat = new Cat("Georgie", 5, "Ginger Tabby");

        myCat.play();
        myDog.play("Hyper Dog");
    }
}
