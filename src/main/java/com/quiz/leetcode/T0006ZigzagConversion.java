package com.quiz.leetcode;

import java.util.HashMap;
import java.util.Map;

public class T0006ZigzagConversion {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows)
            return s;

        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        boolean goDown = false;
        int currentRow = 0;
        for (char c : s.toCharArray()) {
            rows[currentRow].append(c);

            if (currentRow == 0 || currentRow == numRows - 1) {
                goDown = !goDown;
            }

            currentRow += goDown ? 1 : -1;
        }

        for (int i = 1; i < numRows; i++) {
            rows[0].append(rows[i]);
        }

        return rows[0].toString();
    }
}
