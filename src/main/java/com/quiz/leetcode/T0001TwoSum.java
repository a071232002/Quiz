package com.quiz.leetcode;

import java.util.HashMap;
import java.util.Map;

public class T0001TwoSum {

    public static void main(String[] args) {

    }

    public static int[] twoSum(int[] nums, int target) {
        int ans = 0;
        int ans2 = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    ans = i;
                    ans2 = j;
                }
            }
        }
        return new int[] { ans, ans2 };
    }

    public static int[] twoSum2(int[] nums, int target) {
        int length = nums.length;
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < length; i++) {
            numMap.put(nums[i], i);
        }
        for (int i = 0; i < length; i++) {
            int ans2 = target - nums[i];
            if (numMap.containsKey(ans2) && numMap.get(ans2) != i) {
                return new int[] { i, numMap.get(ans2) };
            }
        }
        return new int[] { };
    }
}
