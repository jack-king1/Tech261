package com.sparta.jk;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ProgramTest {

    @Test //Carries meta data. Passes this to JVM
    @DisplayName("This is my first test!") //This makes reading the console output more readable, not a replacement
    public void basicTest(){
        Assertions.assertTrue(5 == 5, "Failed the test!!!!");
    }

    @Test
    @DisplayName("Given a time of 21, then the greeting should be evening!")
    void checkThat21ivesGoodEvening(){
        String exepctedGreeting = "Good evening!";
        String actualGteeting = Program.getTimeofDay(21);
        Assertions.assertEquals(exepctedGreeting, actualGteeting);
    }
}
