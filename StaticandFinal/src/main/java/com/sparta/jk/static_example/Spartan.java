package com.sparta.jk.static_example;

public class Spartan {

    //the static value belongs to the class, rather than to an individual object.
    private static String name;

    public  void setName(String name) {
        Spartan.name = name;
    }

    public String getName() {
        return name;
    }

    public static void printSpartan(Spartan spartan){
        System.out.println("Name: " + spartan.getName());
    }
}
