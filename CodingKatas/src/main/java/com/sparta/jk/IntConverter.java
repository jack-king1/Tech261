package com.sparta.jk;

public class IntConverter {
    private int[] numbersToConvert;

    public static int getSingleIntFromArray(int[] numbers){
        int singleInt = 0;
        StringBuilder numberAsString = new StringBuilder();
        boolean numberStarted = false;
        if(numbers.length > 0){
            for (int item : numbers) {
                if(numberStarted){
                    if(item == 0){
                        continue;
                    }
                    else{
                        numberStarted = true;
                    }
                }
                int absInt = Math.abs(item);
                numberAsString.append(Integer.toString(absInt));
            }
        }
        else{
            numberAsString.append("0");
        }

        singleInt = Integer.parseInt(numberAsString.toString());

        return singleInt;
    }
}
