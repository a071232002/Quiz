package com.quiz.leetcode;

import java.util.*;

public class T0017LetterCombinationsOfAPhoneNumber {
    static Map<String, List<String>> numMap = new HashMap<String, List<String>>();

    static {
        numMap.put("2", Arrays.asList("a", "b", "c"));
        numMap.put("3", Arrays.asList("d", "e", "f"));
        numMap.put("4", Arrays.asList("g", "h", "i"));
        numMap.put("5", Arrays.asList("j", "k", "l"));
        numMap.put("6", Arrays.asList("m", "n", "o"));
        numMap.put("7", Arrays.asList("p", "q", "r", "s"));
        numMap.put("8", Arrays.asList("t", "u", "v"));
        numMap.put("9", Arrays.asList("w", "x", "y", "z"));
    }

    //Memory Limit Exceeded digits="234" 11/25 testcases passed
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.isEmpty()) return result;
        result = numMap.get(digits.substring(0, 1));
        List<String> tempList = new ArrayList<>();
        List<String> list = new ArrayList<String>();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < digits.length(); i++) {
            list = numMap.get(digits.substring(i, i + 1));
            for (int j = 0; j < result.size(); j++) {
                for (int k = 0; k < list.size(); k++) {
                    sb.setLength(0);
                    sb.append(result.get(j)).append(list.get(k));
                    tempList.add(sb.toString());
                }
            }
            result = tempList;
        }
        return result;
    }

    //1ms 41.69MB
    public List<String> letterCombinations2(String digits) {
        List<String> result = new ArrayList<String>();
        if (digits.isEmpty()) return result;
        combin(digits, 0, new StringBuilder(), result);
        return result;
    }

    private void combin(String digits, int index, StringBuilder sb, List<String> result) {
        if (index == digits.length()) {
            result.add(sb.toString());
            return;
        }

        List<String> letters = numMap.get(digits.substring(index, index + 1));
        for (String letter : letters) {
            sb.append(letter);
            combin(digits, index + 1, sb, result);
            sb.setLength(sb.length() - 1);
        }
    }
}
