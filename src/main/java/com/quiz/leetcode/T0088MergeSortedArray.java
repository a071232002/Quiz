package com.quiz.leetcode;

import java.util.Arrays;

public class T0088MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        merge2(nums1, 3, nums2, 3);

//        int[] nums3 = {1};
//        int[] nums4 = {};
//        merge(nums3, 1, nums4, 0);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int j = 0, i = m; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);

        for (int l = 0; l < nums1.length; l++) {
            System.out.print(nums1[l] + " ");
        }
    }

    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
        for (int l = 0; l < nums1.length; l++) {
            System.out.print(nums1[l] + " ");
        }
    }
}
