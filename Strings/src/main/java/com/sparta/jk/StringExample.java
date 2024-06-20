package com.sparta.jk;

public class StringExample {
    public static void main(String[] args) {
        String string1 = "Hello"; //Immutable - Once you declare it, it cannot be changed.
        String stringToUpper = string1.toUpperCase();
        System.out.println(stringToUpper);

        char[] toChar = string1.toCharArray();

        String string = String.valueOf(100);
        System.out.println(toChar);

        //Concatanation - adding strings
        String name = "Jack";
        System.out.println("Hello " + name); //this will create 3 strings in java name, "Hello" and name;

        //StringBuilder is a solution

        //write a methd if a String is a palemdrome.
        //A palemdrome is spelt forwards and backwards.
        //At least 3 letters long
        //Palendrome case insensitive.
        //Strings can be empty and null
        //consider spaces race car != palendraome


    }
}
