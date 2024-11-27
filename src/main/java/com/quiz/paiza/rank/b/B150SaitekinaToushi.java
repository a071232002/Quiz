package com.quiz.paiza.rank.b;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class B150SaitekinaToushi {
    //40  4/10
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] parts = sc.nextLine().split(" ");
        int n = Integer.parseInt(parts[0]);
        int money = Integer.parseInt(parts[1]);
        int goal = Integer.parseInt(parts[2]);

        Integer[] products = new Integer[n];
        for (int i = 0; i < n; i++) {
            products[i] = Integer.parseInt(sc.nextLine());
        }
        Arrays.sort(products, Comparator.reverseOrder());

        int days = 1;

        for (int i = 0; i < n; i++) {
            if (products[i] == 1)
                continue;
            money *= products[i];
            if (money >= goal*days){
                System.out.println(days);
                return;
            }
            days++;
        }
        System.out.println(-1);
    }
}
