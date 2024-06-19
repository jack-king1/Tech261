package com.sparta.jk.identicalneighbours;

public class IdenticalNeighbours {
    //Create a method which checks whether an array of integers contains the same value 3 times in a row.
    //
    //For example: { 2, 3, 3, 3, 5, 7 } returns true whilst { 3, 4, 5, 1, 2 } returns false

    public static boolean hasIdenticalNeighbours(int[] numbers){
        if(!isValidArray(numbers)) return false;

        int identicalCount = 1;
        int previousNumber = -1;

        for (int num : numbers) {
            if(isIdenticalNumber(num, previousNumber)){
                identicalCount++;
            }
            else identicalCount = 1;

            previousNumber = num;
            if(identicalCount >= 3) break;
        }
        return identicalCount >= 3;
    }

    public static boolean isValidArray(int[] arrayToCheck){
        final int MIN_ARRAY_LENGTH = 3;
        if(arrayToCheck == null) return false;
        else if(arrayToCheck.length < MIN_ARRAY_LENGTH) return false;

        return true;
    }

    public static boolean isIdenticalNumber(int currentNum, int previousNum){
        return currentNum == previousNum;
    }
}
