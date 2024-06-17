package com.sparta.jk;

public class Program {
    public static void main(String[] args)
    {
        int timeOfDay = 5;
        System.out.println(getTimeofDay(timeOfDay));
    }

    public static class TimeofDay{
        public static int morningStart = 5;
        public static int afterNoonStart = 12;
        public static int eveningStart = 18;
        public static int endOfDay = 23;
        public static String[] greetings = {"Good Morning!", "Good Afternoon!", "Good Evening!"};
    }

    public static String getTimeofDay(int timeOfDay) {
        int currentTime = Math.abs(timeOfDay);
        if(currentTime > TimeofDay.endOfDay) return "Invalid Time";

        if(currentTime >= TimeofDay.morningStart && currentTime < TimeofDay.afterNoonStart) return TimeofDay.greetings[0];
        else if (currentTime > TimeofDay.morningStart && currentTime <= TimeofDay.eveningStart) return TimeofDay.greetings[1];
        else return TimeofDay.greetings[2];

    }
}
