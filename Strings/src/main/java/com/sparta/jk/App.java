package com.sparta.jk;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
//        String string1 = "Hello";
//        String string2 = "Hello"; //hash is based on string literal.
//        String string3 = new String("Hello"); //hash is based on an algorithm or something about the object,
//        String string4 = new String("Hello"); //redundant as we want to check if its in the string pool.
//
//        System.out.println(string1.hashCode());
//        System.out.println(string2.hashCode());
//        System.out.println(string3.hashCode());
//        System.out.println(string4.hashCode());
//        System.out.println("");
//        System.out.println(System.identityHashCode(string1)); //force the base class hashCode.
//        System.out.println(System.identityHashCode(string2)); //force the base class hashCode.
//        System.out.println(System.identityHashCode(string3)); //force the base class hashCode.
//        System.out.println(System.identityHashCode(string4)); //force the base class hashCode.
//
        //System.out.println(PalindromeIdentifier.isPalinDrome("The rac'ecar!%^&*() is going racing against other racecar"));

        ArrayList<String> longestPalindrome = PalindromeIdentifier.getLongestPalindromeInSentence("ara loool race^car racecar lllllll");
        System.out.println(longestPalindrome);
    }
}
