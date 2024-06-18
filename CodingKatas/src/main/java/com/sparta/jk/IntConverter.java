package com.sparta.jk;

import java.util.ArrayList;

public class IntConverter {
    private int[] numbersToConvert;

    public static int getSingleIntFromArray(int[] numbers){
        int singleInt = 0;
        StringBuilder numberAsString = new StringBuilder();
        for (int item : numbers) {
            numberAsString.append(Integer.toString(item));
        }
        singleInt = Integer.parseInt(numberAsString.toString());

        return singleInt;
    }
}
