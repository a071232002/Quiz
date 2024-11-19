package com.quiz.leetcode;

public class T0189RotateArray {


    //1ms 57.22MB
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0 || nums.length == 1 || k == 0) return;
        int[] temp = nums.clone();
        int n = nums.length;
        int kIndex = n - k % n;
        int index = 0;
        for (int i = 0; i < n; i++) {
            if ( kIndex < n ) {
                nums[i] = temp[kIndex++];
            } else {
                nums[i] = temp[index++];
            }
        }
    }

    public void rotate2(int[] nums, int k) {
        k = k % nums.length;
        if (k != 0) {
            int[] temp = new int[nums.length];
            System.arraycopy(nums, nums.length - k, temp, 0, k);
            System.arraycopy(nums, 0, temp, k, nums.length - k);
            System.arraycopy(temp, 0, nums, 0, nums.length);
        }
    }


    public void rotate3(int[] nums, int k) {
        k %= nums.length;

        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}