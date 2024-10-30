package com.quiz.leetcode;

public class T0014LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println(longestCommonPrefix(new String[]{"flower"}));
        System.out.println(longestCommonPrefix2(new String[]{"flower"}));
    }

    // 1ms 41.86MB
    public static String longestCommonPrefix(String[] strs) {
        String checkStr = "";
        String result = "";
        for (int i = 1; i <= strs[0].length(); i++) {
            checkStr = strs[0].substring(0, i);
            for (int j = 1; j < strs.length; j++) {
                if (!strs[j].startsWith(checkStr)) {
                    return result;
                }
            }
            result = checkStr;
        }
        return result;
    }

    // 0ms 41.27MB
    public static String longestCommonPrefix2(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String checkStr = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(checkStr)) {
                checkStr = checkStr.substring(0, checkStr.length() - 1);
                if (checkStr.isEmpty()) return "";
            }
        }
        return checkStr;
    }
}
