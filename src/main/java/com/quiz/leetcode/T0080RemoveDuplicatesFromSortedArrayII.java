package com.quiz.leetcode;

import java.util.HashMap;
import java.util.Map;

public class T0080RemoveDuplicatesFromSortedArrayII {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        Map<Integer,Integer> numsMap = new HashMap<>();
        int requestCount = 2;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            numsMap.put(nums[i], numsMap.getOrDefault(nums[i], 0) + 1);
            if (numsMap.get(nums[i]) <= requestCount) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }

    public static int removeDuplicates2(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return 1;
        int index = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[index - 2]) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}
