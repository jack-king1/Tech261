package com.sparta.jk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class PalindromeIdentifier {
    //String builder is more efficient than this
    //1. Methods in api are tested and througherly than anything i can put togethor.
    //2. people who write the class they know the JVM and how it works.
    //3. Documented and optimized better.

//    Part 2:
//    Create a program that finds the longest unique Palindrome in a sentence
//    A sentence is defined as a single string of words separated by whitespace
//    If there are 2 or more largest palindromes, both should be returned
//    The program should ignore all non-alphabet characters

    public static ArrayList<String> getLongestPalindromeInSentence(String mySentence){
        ArrayList<String> longestPalindromes = new ArrayList<String>();

        //filter sentnece
        String filteredSentence = removeSpecialCharacters(mySentence);

        //get seperate word array
        String[] wordArray = getSeperateWordsArrayFromSentence(filteredSentence);

        //check each word of array and get the longest ones. no duplicates
        for(String word : wordArray){
            if(isPalinDrome(word)){
                if(longestPalindromes.isEmpty()){
                    longestPalindromes.add(word);
                }
                else{
                    if(word.length() > longestPalindromes.get(0).length()){
                        longestPalindromes.clear();
                        longestPalindromes.add(word);
                    }
                    else if(word.length() == longestPalindromes.get(0).length() &&
                            !word.equals(longestPalindromes.get(0))){
                        longestPalindromes.add(word);
                    }
                }
            }
        }

        return longestPalindromes;
    }

    public static boolean isPalinDrome(String potentialPalindrome){
        if(potentialPalindrome == null) return false;
        if(potentialPalindrome.length() < 3) return false;



        boolean isAPalindrome = false;
        char[] charArray = potentialPalindrome.toCharArray();

        for(int i = 0; i < charArray.length; i++){
            System.out.println(charArray[i] + " " + charArray[(charArray.length - 1) -i]);
            if(charArray[i] !=  charArray[(charArray.length - 1) -i]){
                return false;
            }
            isAPalindrome = true;
        }

        return isAPalindrome;
    }

    public static String removeSpecialCharacters(String sentence){
        String filteredString = sentence.replaceAll("[^a-zA-Z\\s]", "");
        System.out.println(filteredString);
        return filteredString;
    }


    public static String[] getSeperateWordsArrayFromSentence(String sentence){
        //Use string.split
        String[] wordsArray = sentence.split(" ");
        System.out.println(Arrays.toString(wordsArray));
        return wordsArray;
    }

//    public static String[] getLongestPalindromes(String[] words){
//
//    }
}
