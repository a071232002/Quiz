package com.quiz.leetcode;

public class T0392IsSubsequence {
    //0ms 100% 40.71MB 99.35%
    public boolean isSubsequence(String s, String t) {
        if (s.length() > t.length()) return false;

        int tempIndex = -1;
        for (int i = 0; i < s.length(); i++) {
            int currentIndex = t.indexOf(s.charAt(i), tempIndex + 1);
            if (currentIndex == -1)
                return false;
            else
                tempIndex = currentIndex;
        }
        return true;
    }
}
