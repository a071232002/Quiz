package com.quiz.leetcode;

public class T0055JumpGame {
    public static void main(String[] args) {
        System.out.println(canJump2(new int[]{2, 3, 1, 1, 4}));
    }

    public static boolean canJump2(int[] nums) {
        int goal = nums.length - 1;

        for (int i = nums.length - 2; i >= 0; i--) {
            if (i + nums[i] >= goal) {
                goal = i;
            }
        }
        return goal == 0;
    }
}