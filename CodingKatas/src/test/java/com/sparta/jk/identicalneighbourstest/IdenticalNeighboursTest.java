package com.sparta.jk.identicalneighbourstest;

import com.sparta.jk.identicalneighbours.IdenticalNeighbours;
import com.sparta.jk.integerarrayconverter.IntConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IdenticalNeighboursTest {

    @Test
    @DisplayName("Test if null array returns false")
    void checkOutputReturnsFalseGivenAnEmptyArray(){
        int[] numbers = new int[] {};
        boolean actual = IdenticalNeighbours.hasIdenticalNeighbours(numbers);
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test if output returns true if 3 or more identical numbers are found")
    void checkOutputReturnsTrueIf3orMoreIdenticalNumbersFound(){
        int[] numbers = new int[] {1,1,1};
        boolean actual = IdenticalNeighbours.hasIdenticalNeighbours(numbers);
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test if output returns false if array contains less than 3 values")
    void checkOutputReturnsFalseIfArrayContainsLessThan3Values(){
        int[] numbers = new int[] {1,1};
        boolean actual = IdenticalNeighbours.hasIdenticalNeighbours(numbers);
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test if output returns false if no valid conditions are met with a valid array")
    void checkOutputReturnsFalseIfArrayContainsNoValidConditions(){
        int[] numbers = new int[] {1,1,2,2,3,3};
        boolean actual = IdenticalNeighbours.hasIdenticalNeighbours(numbers);
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }
}
