package com.quiz.leetcode;

public class T0011ContainerWithMostWater {
    //6ms
    public int maxArea(int[] height) {
        int left = 1, right = height.length;
        int maxArea = 0;
        while (left < right) {
            int area = Math.min(height[left-1], height[right-1]) * (right - left);
            maxArea = Math.max(maxArea, area);
            if (height[left-1] < height[right-1]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

    //2ms
    public int maxArea2(int[] height) {
        int left = 0, right = height.length - 1;
        int maxArea = 0;
        while (left < right) {
            int h = Math.min(height[left], height[right]);
            int area = h * (right - left);
            maxArea = Math.max(maxArea, area);

            while (left < right && height[left] <= h) {
                left++;
            }
            while (left < right && height[right] <= h) {
                right--;
            }
        }
        return maxArea;
    }
}
