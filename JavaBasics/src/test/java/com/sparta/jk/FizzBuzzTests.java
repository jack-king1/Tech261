package com.sparta.jk;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class FizzBuzzTests {
    //Print number in order
    //If the number is divisible by 3 print "Fizz"
    //If the number is divisible by 5 print "buzz"
    //If the number is divisible by 3 & 5 print "fizzbuzz"

    @Test
    @DisplayName("Test if numbers print in order")
    void givenAnInputofOneFizzBuzzReturnsOne(){
        //Arrange
        int input = 1;
        String expectedOutput = "1";

        //Act
        String actual = FizzBuzz.getFizzBuzzFrom(input);

        //Refactor
        Assertions.assertEquals(expectedOutput, actual);
    }

    @Test
    void givenAnInputofThreeFizzBuzzReturnsFizz(){
        int input = 3;
        String expected = "Fizz";

        String actual = FizzBuzz.getFizzBuzzFrom(input);

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9})
    void givenAnInputOfThreeFizzBuzzReturnsFizz(int input){
        String expected = "Fizz";

        String actual = FizzBuzz.getFizzBuzzFrom(input);

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "2, 2",
            "4, 4",
            "7, 7"
    })
    void givenInputsNotDivisibleBy3or5FizzBuzzReturnsThatNumber(int input, String expected) {

        String actual = FizzBuzz.getFizzBuzzFrom(input);

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "3, Fizz",
            "6, Fizz",
            "33, Fizz"
    })
    void givenInputsDivisibleBy3FizzBuzzReturnsThatFizz(int input, String expected) {

        String actual = FizzBuzz.getFizzBuzzFrom(input);

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "5, Buzz",
            "10, Buzz",
            "50, Buzz"
    })
    void givenInputsDivisibleBy5FizzBuzzReturnsThatFizz(int input, String expected) {

        String actual = FizzBuzz.getFizzBuzzFrom(input);

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "15, FizzBuzz",
            "30, FizzBuzz",
            "60, FizzBuzz"
    })
    void givenInputsDivisibleBy3and5FizzBuzzReturnsThatFizzBuzz(int input, String expected) {

        String actual = FizzBuzz.getFizzBuzzFrom(input);

        Assertions.assertEquals(expected, actual);
    }
}
