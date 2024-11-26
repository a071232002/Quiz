package com.quiz.paiza.rank.a;

import java.util.Scanner;

public class A051ItaTaoshi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] size = sc.nextLine().split(" ");

        int h = Integer.parseInt(size[0]);
        int w = Integer.parseInt(size[1]);

        int[][] itaArr = new int[h][w];

        for (int i = 0; i < h; i++) {
            String[] line = sc.nextLine().split(" ");
            for (int j = 0; j < w; j++) {
                itaArr[i][j] = Integer.parseInt(line[j]);
            }
        }

        int max = 0;

        for (int i = h - 2; i >= 0; i--) {
            for (int j = 0; j < w; j++) {
                if (j == 0) {
                    itaArr[i][j] += Math.max(itaArr[i + 1][j], itaArr[i + 1][j + 1]);
                } else if ( j == w - 1) {
                    itaArr[i][j] += Math.max(itaArr[i + 1][j - 1], itaArr[i + 1][j]);
                } else {
                    itaArr[i][j] += Math.max(Math.max(itaArr[i + 1][j - 1], itaArr[i + 1][j]), itaArr[i + 1][j + 1]);
                }
            }
        }

        for (int i = 0; i < w; i++) {
            if (itaArr[0][i] > max) max = itaArr[0][i];
        }

        System.out.println(max);
    }
}
