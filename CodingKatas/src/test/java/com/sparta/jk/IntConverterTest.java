package com.sparta.jk;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
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
}
