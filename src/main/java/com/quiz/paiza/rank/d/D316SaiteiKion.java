package com.quiz.paiza.rank.d;

import java.util.Scanner;

public class D316SaiteiKion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = Integer.parseInt(sc.nextLine());
        while (sc.hasNextLine()) {
            int num = Integer.parseInt(sc.nextLine());
            if (num < result) {
                result = num;
            }
        }
        System.out.println(result);
    }
}
