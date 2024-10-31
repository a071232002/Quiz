package com.quiz.leetcode;

import java.util.HashMap;
import java.util.Map;

public class T0013RomanToInteger {
    public static void main(String[] args) {
        System.out.println((romanToInt2("III")));
        System.out.println((romanToInt3("III")));
    }

    public static int romanToInt(String s) {
        int result = 0;
        char c;
        char temp = 'A';
        for (int i = s.length() - 1; i >= 0; i--) {
            c = s.charAt(i);
            switch (c) {
                case 'I':
                    if (temp == 'V' || temp == 'X') {
                        result -= 1;
                    } else {
                        result += 1;
                    }
                    break;
                case 'V':
                    result += 5;
                    break;
                case 'X':
                    if (temp == 'L' || temp == 'C') {
                        result -= 10;
                    } else {
                        result += 10;
                    }
                    break;
                case 'L':
                    result += 50;
                    break;
                case 'C':
                    if (temp == 'D' || temp == 'M') {
                        result -= 100;
                    } else {
                        result += 100;
                    }
                    break;
                case 'D':
                    result += 500;
                    break;
                case 'M':
                    result += 1000;
                    break;
            }
            temp = c;
        }
        return result;
    }

    public static int romanToInt2(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = romanMap.get(s.charAt(s.length()-1));

        for (int i = 0; i < s.length() -1 ; i++) {
            if (romanMap.get(s.charAt(i)) < romanMap.get(s.charAt(i + 1))) {
                result -= romanMap.get(s.charAt(i));
            } else {
                result += romanMap.get(s.charAt(i));
            }
        }
        return result;
    }

    public static int romanToInt3(String s) {
        int num = 0;
        int ans = 0;
        int temp = 0;
        for (int i= s.length() - 1; i >= 0; i--){
            num = switch (s.charAt(i)) {
                case 'I' -> 1;
                case 'V' -> 5;
                case 'X' -> 10;
                case 'L' -> 50;
                case 'C' -> 100;
                case 'D' -> 500;
                case 'M' -> 1000;
                default -> num;
            };
            if (num < temp){
                ans -= num;
            } else {
                ans += num;
            }
            temp = num;
        }
        return ans;
    }
}
