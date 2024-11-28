package com.quiz.leetcode;

import java.util.Arrays;

public class T0151ReverseWordsInAString {
    //5ms pr93%
    public String reverseWords(String s) {
        String[] words = s.trim().split(" ");
        int len = words.length;

        StringBuilder sb = new StringBuilder();
        for (int i = len - 1; i >= 0; i--) {
            if (words[i].trim().length() == 0)
                continue;
            sb.append(words[i]).append(" ");
        }
        return sb.toString().trim();
    }

    //8ms stream.filter become slow
    public String reverseWords2(String s) {
        String[] words = Arrays.stream(s.trim().split(" "))
                               .filter(str -> !str.isEmpty())
                               .toArray(String[]::new);

        int len = words.length;

        StringBuilder sb = new StringBuilder();
        for (int i = len - 1; i >= 0; i--) {
            sb.append(words[i]).append(" ");
        }
        return sb.toString().trim();
    }
}
