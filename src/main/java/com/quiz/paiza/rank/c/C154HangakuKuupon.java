package com.quiz.paiza.rank.c;

import java.util.Scanner;

public class C154HangakuKuupon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        String[] parts = line.split(" ");
        int num1 = Integer.parseInt(parts[0]);
        int num2 = Integer.parseInt(parts[1]);

        String secondLine = sc.nextLine();
        String[] nums = secondLine.split(" ");
        int[] array = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            array[i] = Integer.parseInt(nums[i]);
        }
        int count = 0;
        int max = 0;
        for (int num : array) {
            count += num;
            max = num > max ? num : max;
        }
        if (max > num2){
            num2 = max/2;
        } else {
            num2 = 0;
        }
        System.out.println(count - num2);
    }
}
