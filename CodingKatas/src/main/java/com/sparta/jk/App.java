package com.sparta.jk;

import com.sparta.jk.identicalneighbours.IdenticalNeighbours;

public class App {
    public static void main(String[] args) {
        //region Int Converter
//        int[] numbers = {0,0,0,0,1, 0, 2, 4, 5, 4, 3};
//        int test = IntConverter.getSingleIntFromArray(numbers);
//        System.out.println("my new number is: " + test);
        //endregion


        //Create a method which checks whether an array of integers contains the same value 3 times in a row.
        //
        //For example: { 2, 3, 3, 3, 5, 7 } returns true whilst { 3, 4, 5, 1, 2 } returns false

        int[] testArray = {3,3,3,4,5};
        System.out.println(IdenticalNeighbours.hasIdenticalNeighbours(testArray));
    }
}
