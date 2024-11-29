package com.quiz.paiza.rank.b;

import java.util.Scanner;

public class B156Uzumaki {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] size = sc.nextLine().split(" ");
        int h = Integer.parseInt(size[0]);
        int w = Integer.parseInt(size[1]);

        String[] range = sc.nextLine().split(" ");
        int start = Integer.parseInt(range[0]);
        int end = Integer.parseInt(range[1]);

        char[][] charArr = new char[h][w];

        for (int i = 0; i < h; i++) {
            char[] chars = sc.nextLine().toCharArray();
            for (int j = 0; j < w; j++) {
                charArr[i][j] = chars[j];
            }
        }

        int left = 0;
        int right = w;
        int top = 0;
        int bottom = h;
        StringBuilder sb = new StringBuilder();

        while (left < right && top < bottom) {
            for (int col = left; col < right; col++) {
                sb.append(charArr[top][col]);
            }
            top++;

            for (int row = top; row < bottom; row++) {
                sb.append(charArr[row][right - 1]);
            }
            right--;

            for (int col = right - 1; col >= left; col--) {
                sb.append(charArr[bottom - 1][col]);
            }
            bottom--;

            for (int row = bottom - 1; row >= top; row--) {
                sb.append(charArr[row][left]);
            }
            left++;
        }
        System.out.println(sb.substring(start - 1, end));
    }
}
