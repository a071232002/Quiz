package com.quiz.leetcode;

import java.util.HashMap;
import java.util.Map;

public class T0169MajorityElement {

    //1070ms 53.66MB
    public int majorityElement(int[] nums) {
        if (nums.length == 1) return nums[0];
        int result = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > n/2) {
                result = nums[i];
                break;
            }
        }
        return result;
    }

    //16ms 49.90MB better one
    public int majorityElement2(int[] nums) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        int result = 0;
        for (int num : nums) {
            numsMap.put(num, numsMap.getOrDefault(num, 0) + 1);
            if (numsMap.get(num) > nums.length / 2) {
                result = num;
                return result;
            }
        }
        return result;
    }

    //0ms 53.31MB
    public int majorityElement3(int[] nums) {
        return majorityElementHelper(nums, 0, nums[0]);
    }
    public int majorityElementHelper(int[] nums, int start, int num) {
        int count = 0;
        for (int i = start; i < nums.length; i++) {
            if (nums[i] == num) {
                count++;
            } else {
                count--;
            }
            if (count < 0) {
                return majorityElementHelper(nums, i, nums[i]);
            }
        }
        return num;
    }
}
