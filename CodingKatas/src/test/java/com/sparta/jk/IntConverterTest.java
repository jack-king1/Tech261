package com.sparta.jk;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class IntConverterTest {
    @Test
    @DisplayName("Test if output is correct and returns the output 1024")
    void checkOutputOfIntConverterGivesTheValue1024(){
        int[] numbers = new int[] {1,0,2,4};
        int actual = IntConverter.getSingleIntFromArray(numbers);
        int expected = 1024;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test if output is correct and returns the output 102449594 for max digits.")
    void checkOutputOfIntConverterGivesTheValue102449594ForMaxDigits(){
        int[] numbers = new int[] {1,0,2,4,4,9,5,9,4};
        int actual = IntConverter.getSingleIntFromArray(numbers);
        int expected = 102449594;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test if output is correct and returns the output 1 for min digits.")
    void checkOutputOfIntConverterGivesTheValue1ForMinDigits(){
        int[] numbers = new int[] {1};
        int actual = IntConverter.getSingleIntFromArray(numbers);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test if output is correct and returns the output 1 for the input 00001.")
    void checkOutputOfIntConverterGivesTheValue1ForTheInput00001(){
        int[] numbers = new int[] {0,0,0,0,1};
        int actual = IntConverter.getSingleIntFromArray(numbers);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test if empty array is zero")
    void checkOutputOfAnEmptyArrayIsZero(){
        int[] numbers = new int[] {};
        int actual = IntConverter.getSingleIntFromArray(numbers);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test if array values with more than one integer results in correct output [0,0,0,32,2,3,6]")
    void checkOutputOfArrayWithValuesWithTwoIntegers(){
        int[] numbers = new int[] {0,0,0,32,2,3,6};
        int actual = IntConverter.getSingleIntFromArray(numbers);
        int expected = 32236;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test if array values with negative didgits results in a positive output")
    void checkOutputIsNotNegative(){
        int[] numbers = new int[] {0,-0,0,-32,2,-3,-6};
        int actual = IntConverter.getSingleIntFromArray(numbers);
        int expected = 32236;
        Assertions.assertEquals(expected, actual);
    }
}
