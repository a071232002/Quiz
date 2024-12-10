package com.quiz.paiza.rank.c;

import java.util.Scanner;

public class C038OkashiNoBunnpai {

    //75point 8.5/10
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] info = sc.nextLine().split(" ");

        int n = Integer.parseInt(info[0]);
        int total = Integer.parseInt(info[1]);

        int dig;
        int tempDig = Integer.MAX_VALUE, tempNum = 0;
        int ans = 0;

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(sc.nextLine());
            dig = total % num;

            if (dig < tempDig) {
                tempDig = dig;
                tempNum = num;
                ans = i;
            } else if (dig == tempDig && num > tempNum) {
                ans = i;
            }
        }

        System.out.println(ans);
    }
}
