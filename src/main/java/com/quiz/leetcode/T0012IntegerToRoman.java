package com.quiz.leetcode;

public class T0012IntegerToRoman {
    public String intToRoman(int num) {
        final int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        final String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            if (num == 0)
                break;
            while (num >= values[i]) {
                sb.append(roman[i]);
                num -= values[i];
            }
        }
        return sb.toString();
    }
}