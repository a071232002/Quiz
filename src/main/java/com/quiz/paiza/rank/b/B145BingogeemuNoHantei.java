package com.quiz.paiza.rank.b;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class B145BingogeemuNoHantei {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] parts = str.split(" ");
        int n = Integer.parseInt(parts[0]);
        int times = Integer.parseInt(parts[1]);

        int[][] nums = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] num = sc.nextLine().split(" ");
            for (int j = 0; j < n; j++) {
                nums[i][j] = Integer.parseInt(num[j]);
            }
        }

        int[] matchNum = new int[times];
        String[] match = sc.nextLine().split(" ");
        for (int i = 0; i < times; i++) {
            matchNum[i] = Integer.parseInt(match[i]);
        }

        List<Integer> matchList = Arrays.stream(matchNum)
                .boxed()
                .collect(Collectors.toList());
        int result = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            int countH = 0;
            for (int j = 0; j < n; j++) {
                if (matchList.contains(nums[i][j])) count++;
                if (matchList.contains(nums[j][i])) countH++;
                if (count == n) result++;
                if (countH == n) result++;
            }
        }
        System.out.println(result);
    }
}
