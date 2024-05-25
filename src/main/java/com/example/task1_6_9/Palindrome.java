package com.example.task1_6_9;

public class Palindrome {
    public static boolean isPalindrome(String str) {
        String replaced = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        String revers = new StringBuffer(replaced).reverse().toString();
        return revers.equals(replaced);
    }
}
