package com.quiz.paiza.rank.c;

import java.util.Scanner;

public class C069OmatsuriNoHizuke {
    //all pass, memory 1787byte => 79point
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] info = sc.nextLine().split(" ");
        String[] info2 = sc.nextLine().split(" ");

        int odd = 13, even = 15;

        int year = Integer.parseInt(info[0]);
        int month = Integer.parseInt(info[1]);
        int day = Integer.parseInt(info[2]);

        int nowDayOfYear = 0;
        for (int i = 1; i < month; i++) {
            if ( i % 2 != 0)
                nowDayOfYear += odd;
            else
                nowDayOfYear += even;
        }
        nowDayOfYear += day;

        int monthTarget = Integer.parseInt(info2[0]);
        int dayTarget = Integer.parseInt(info2[1]);

        int targetDayOfYear = 0;
        for (int i = 1; i < monthTarget; i++) {
            if ( i % 2 != 0)
                targetDayOfYear += odd;
            else
                targetDayOfYear += even;
        }
        targetDayOfYear += dayTarget;

        int dig = year % 4;
        int yearDiff = -1;
        switch (dig) {
            case 0 -> yearDiff = 1;
            case 1 -> yearDiff = nowDayOfYear > targetDayOfYear ? 4 : 0;
            case 2 -> yearDiff = 3;
            case 3 -> yearDiff = 2;
        }

        int totalDaysOfYear = 0;

        for (int i = 1; i <= 13; i++) {
            if ( i % 2 != 0)
                totalDaysOfYear += odd;
            else
                totalDaysOfYear += even;
        }

        int ans = 0;
        if (yearDiff > 0) {
            ans += totalDaysOfYear - nowDayOfYear;
            ans += targetDayOfYear;
            ans += totalDaysOfYear*(yearDiff-1);
        } else {
            ans = targetDayOfYear - nowDayOfYear;
        }

        System.out.println(ans);
    }
}
