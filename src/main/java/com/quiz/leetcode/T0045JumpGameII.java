package com.quiz.leetcode;

public class T0045JumpGameII {
    public int jump(int[] nums) {
        int n = nums.length;
        int step = 0;
        int far = 0;
        int stayPoint = 0;
        if (n <= 1) return 0;

        for (int i = 0; i < n; i++) {
            far = Math.max(far, i + nums[i]);
            if (i == stayPoint) {
                step++;
                stayPoint = far;
                if (stayPoint >= n - 1) {
                    break;
                }
            }
        }
        return step;
    }

}
