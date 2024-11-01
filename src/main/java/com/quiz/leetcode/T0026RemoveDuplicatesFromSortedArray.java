package com.quiz.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class T0026RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        Map<Integer,Integer> numsMap = new HashMap<>();
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            numsMap.put(nums[i], numsMap.getOrDefault(nums[i], 0) + 1);
            if (numsMap.get(nums[i]) <= 1) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }

    public static int removeDuplicates2(int[] nums) {
        Map<Integer,Integer> numsMap = new TreeMap<>();
        int index = 0;
        for (int num : nums) {
            numsMap.put(num, num);
        }
        for (Integer key :numsMap.keySet()){
            nums[index++] = key;
        }
        return index;
    }

    public static int removeDuplicates3(int[] nums) {
        if (nums.length == 0) return 0;
        int index = 1;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[index - 1]) {
                nums[index++] = nums[j];
            }
        }
        return index;
    }
}
