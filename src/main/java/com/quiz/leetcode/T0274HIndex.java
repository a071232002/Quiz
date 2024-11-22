package com.quiz.leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class T0274HIndex {
    //0ms 41.2MB
    public static int hIndex(int[] citations) {
        int papers = citations.length;
        int[] citationBuckets = new int[papers + 1];
        for (int citation : citations) {
            citationBuckets[Math.min(citation, papers)]++;
        }
        int cumulativePapers = 0;
        for (int hIndex = papers; hIndex >= 0; hIndex--) {
            cumulativePapers += citationBuckets[hIndex];
            if (cumulativePapers >= hIndex) {
                return hIndex;
            }
        }
        return 0;
    }

    //2ms 41.25MB
    public int hIndex2(int[] citations) {
        int n = citations.length;
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int citation : citations) {
            countMap.put(Math.min(citation, n), countMap
                    .getOrDefault(Math.min(citation, n), 0) + 1);
        }
        int count = 0;
        for (int i = n; i >= 0; i--) {
            count += countMap.getOrDefault(i, 0);
            if (count >= i) {
                return i;
            }
        }
        return 0;
    }

    //2ms  42.05MB
    public int hIndex3(int[] citations) {
        int n = citations.length;
        Arrays.sort(citations);
        for (int i = 0; i < n; i++) {
            if (citations[i] >= n - i) {
                return n - i;
            }
        }
        return 0;
    }
}
