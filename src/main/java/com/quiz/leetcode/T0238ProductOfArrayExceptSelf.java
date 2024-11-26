package com.quiz.leetcode;

public class T0238ProductOfArrayExceptSelf {
    //timeout
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = 1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    result[i] *= nums[j];
                }
            }
        }
        return result;
    }

    public int[] productExceptSelf2(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];

        right[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }
        left[0] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = left[i] * right[i];
        }

        return nums;
    }

    public int[] productExceptSelf3(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] = rightProduct;
            rightProduct *= nums[i];
        }

        int leftProduct = 1;
        for (int i = 1; i < n; i++) {
            leftProduct *= nums[i-1];
            result[i] *= leftProduct;
        }

        return result;
    }
}
