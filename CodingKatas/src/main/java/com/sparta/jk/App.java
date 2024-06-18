package com.sparta.jk;

public class App {
    public static void main(String[] args) {
        int[] numbers = {1, 0, 2, 4, 5, 4, 3};
        int test = IntConverter.getSingleIntFromArray(numbers);
        System.out.println("my new number is: " + test);
    }
}
