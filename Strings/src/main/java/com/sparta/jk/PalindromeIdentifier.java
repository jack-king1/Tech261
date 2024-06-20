package com.sparta.jk;

public class PalindromeIdentifier {
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
}
