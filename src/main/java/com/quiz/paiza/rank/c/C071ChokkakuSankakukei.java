package com.quiz.paiza.rank.c;

import java.util.Scanner;

public class C071ChokkakuSankakukei {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int m = Integer.parseInt(input[0]);
        int n = Integer.parseInt(input[1]);

        int count = 0;

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                int target = i*i + j*j;
                for (int k = 1; k*k <= target; k++) {
                    if (k*k == target) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
