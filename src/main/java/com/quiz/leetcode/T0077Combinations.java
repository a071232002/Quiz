package com.quiz.leetcode;

import java.util.ArrayList;
import java.util.List;

public class T0077Combinations {

    //18ms 81.43%    94.25mb 83.63%
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        if (k > n || k < 0) return result;
        if (k == 0) {
            result.add(new ArrayList<Integer>());
        }
        pickup(result, new ArrayList<>(), 1, n, k);
        return result;
    }

    public void pickup(List<List<Integer>> result, List<Integer> temp, int start, int total, int pickNum) {
        if (temp.size() == pickNum) {
            result.add(new ArrayList<>(temp));
            return;
        }
        for (int i = start; i <= total; i++) {
            temp.add(i);
            pickup(result, temp, i + 1, total, pickNum);
            temp.remove(temp.size() - 1);
        }
    }
}
