package com.quiz.paiza.rank.c;

import java.util.Scanner;

public class C067SuujiNoCyousa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int num = Integer.parseInt(str[1]);

        String binaryStr = Integer.toBinaryString(num);
        binaryStr = new StringBuilder(binaryStr).reverse().toString();
        for (int i = 0; i < n; i++) {
            int index = Integer.parseInt(sc.nextLine()) - 1;
            System.out.println(binaryStr.charAt(index));
        }

    }
}
