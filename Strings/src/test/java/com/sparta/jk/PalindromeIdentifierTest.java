package com.sparta.jk;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

public class PalindromeIdentifierTest {

    @Test
    void checkIfCorrectPalinDromeReturnsTrue(){

        String input = "racecar";
        boolean actual = PalindromeIdentifier.isPalinDrome(input);
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void checkIfFunctionIsCaseSensitive(){

        String input = "racecaR";
        boolean actual = PalindromeIdentifier.isPalinDrome(input);
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void checkIfFunctionIsSpaceSensitive(){

        String input = "racecar ";
        boolean actual = PalindromeIdentifier.isPalinDrome(input);
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void checkIfFunctionIsDetectsNull(){

        String input = "racecar ";
        boolean actual = PalindromeIdentifier.isPalinDrome(input);
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void checkIfInputIsnullAndReturnsFalse(){

        String input = null;
        boolean actual = PalindromeIdentifier.isPalinDrome(input);
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void checkIfInputIsLessThan3Characters(){

        String input = "ra";
        boolean actual = PalindromeIdentifier.isPalinDrome(input);
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }
}
