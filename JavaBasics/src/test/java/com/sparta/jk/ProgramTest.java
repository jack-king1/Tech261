package com.sparta.jk;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ProgramTest {

    @Test
    @DisplayName("Given a time of 18, then the greeting should be evening!")
    void checkThat3ivesGoodEvening(){
        String exepctedGreeting = Program.TimeofDay.greetings[2];
        String actualGteeting = Program.getTimeofDay(21);
        Assertions.assertEquals(exepctedGreeting, actualGteeting);
    }

    @Test
    @DisplayName("Given a time of 12, then the greeting should be Good Afternoon!")
    void checkThat13ivesGoodAfternoon(){
        String exepctedGreeting = Program.TimeofDay.greetings[1];
        String actualGteeting = Program.getTimeofDay(13);
        Assertions.assertEquals(exepctedGreeting, actualGteeting);
    }

    @Test
    @DisplayName("Given a time of 5, then the greeting should be Good Morning!")
    void checkThat5ivesGoodMorning(){
        String exepctedGreeting = Program.TimeofDay.greetings[0];
        String actualGteeting = Program.getTimeofDay(5);
        Assertions.assertEquals(exepctedGreeting, actualGteeting);
    }

    @Test
    @DisplayName("Given a time of 24 the outcome should be Invalid Time")
    void checkThatTimeisWithinBounds(){
        String exepctedGreeting = "Invalid Time";
        String actualGteeting = Program.getTimeofDay(24);
        Assertions.assertEquals(exepctedGreeting, actualGteeting);
    }

    @Test
    @DisplayName("Given a time of 0 the outcome should be Good Evening!")
    void checkThatTimeisWithinBoundsWithZero(){
        String exepctedGreeting = Program.TimeofDay.greetings[2];
        String actualGteeting = Program.getTimeofDay(0);
        Assertions.assertEquals(exepctedGreeting, actualGteeting);
    }

    @Test
    @DisplayName("Given a time of -7 the outcome should be Good Morning!")
    void checkThatNegativeTimesConvertCorrectly(){
        String exepctedGreeting = Program.TimeofDay.greetings[0];
        String actualGteeting = Program.getTimeofDay(-7);
        Assertions.assertEquals(exepctedGreeting, actualGteeting);
    }
}
