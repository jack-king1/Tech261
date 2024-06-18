package com.sparta.jk;

public class Dog {
    private String name;
    private String breed;
    private int age;

    //constructer
    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String args[]){
        Dog myDog = new Dog("Lilly", "Cockapoo", 12);
        System.out.println(myDog.name);
    }
}
