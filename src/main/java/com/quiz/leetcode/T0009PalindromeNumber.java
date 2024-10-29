package com.quiz.leetcode;

public class T0009PalindromeNumber {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        return str.contentEquals(new StringBuffer(str).reverse());
    }
}
