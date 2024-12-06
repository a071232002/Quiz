package com.quiz.leetcode;

import java.util.HashMap;
import java.util.Map;

public class T0167TwoSumIIAndInputArrayIsSorted {
    //6ms
    public int[] twoSum(int[] numbers, int target) {
        int length = numbers.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            map.put(numbers[i], i);
        }

        for (int i = 0; i < length; i++) {
            int ans = target - numbers[i];
            if (map.containsKey(ans) && map.get(ans) != i) {
                return new int[]{i + 1, map.get(ans) +1 };
            }
        }

        return new int[] { };
    }

    //2ms base on asc sequence
    public int[] twoSum2(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int total = numbers[left] + numbers[right];

            if (total == target) {
                return new int[]{left + 1, right + 1};
            } else if (total > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[] { };
    }
}
