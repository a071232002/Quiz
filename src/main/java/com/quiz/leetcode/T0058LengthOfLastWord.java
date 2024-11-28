package com.quiz.leetcode;

public class T0058LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        String[] strArr = s.trim().split(" ");
        String target = strArr[strArr.length - 1];
        return target.length();
    }

    public int lengthOfLastWord2(String s) {
        int end = s.length() - 1;

        while (end >= 0 && s.charAt(end) == ' ') {
            end--;
        }

        int start = end;
        while (start >= 0 && s.charAt(start) != ' ') {
            start--;
        }

        return end - start;
    }
}
