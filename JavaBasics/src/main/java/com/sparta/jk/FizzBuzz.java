package com.sparta.jk;

public class FizzBuzz {
    public static String getFizzBuzzFrom(int num){

        String fizzBuzzString = Integer.toString(num);

        if(num % 3 == 0){
            fizzBuzzString = "";
            fizzBuzzString += "Fizz";
        }

        if(num % 5 == 0){
            fizzBuzzString += "Buzz";
        }

        return fizzBuzzString;
    }
}
