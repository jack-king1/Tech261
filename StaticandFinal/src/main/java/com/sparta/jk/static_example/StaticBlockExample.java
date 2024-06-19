package com.sparta.jk.static_example;

import java.util.ArrayList;

public class StaticBlockExample {
    private static ArrayList<String> names = new ArrayList<String>();

    static { //block which is run once when the class is loaded in JVM.
        names.add("Manish");
        names.add("Alex");
    }

    public static void main(String[] args) {

    }
}
