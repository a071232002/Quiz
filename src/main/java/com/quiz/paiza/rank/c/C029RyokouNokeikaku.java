package com.quiz.paiza.rank.c;

import java.util.Scanner;

public class C029RyokouNokeikaku {
    //point 75
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] info = sc.nextLine().split(" ");
        int n = Integer.parseInt(info[0]) + 1;
        int x = Integer.parseInt(info[1]);

        String[] days = new String[n];
        int[] rain = new int[n];

        for (int i = 0; i < n - 1; i++) {
            String[] info2 = sc.nextLine().split(" ");

            days[i] = info2[0];
            rain[i] = Integer.parseInt(info2[1]);
        }

        int index = 0;
        int min = -1;

        for (int i = 0; i < n - x; i++) {
            int avg = 0;
            for (int j = i; j < i + x; j++) {
                avg += rain[j];
            }
            avg /= x;
            if (min == -1 || avg < min) {
                min = avg;
                index = i;
            }
        }
        System.out.println(days[index] + " " + days[index + x - 1]);
    }
}
