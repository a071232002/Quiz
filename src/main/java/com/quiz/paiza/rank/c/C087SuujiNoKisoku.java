package com.quiz.paiza.rank.c;

import java.util.Scanner;

public class C087SuujiNoKisoku {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());

        while (!isPalindrome(input)) {
           input = sumOfOriginalAndReverse(input);
        }
        int ans = input;
        System.out.println(ans);
    }

    public static int sumOfOriginalAndReverse(int input) {
        int reverse = 0;
        int original = input;
        while (input > 0) {
            reverse = reverse * 10 + input % 10;
            input = input / 10;
        }
        return reverse + original;
    }

    public static boolean isPalindrome(int input) {
        if (input < 0 || (input % 10 == 0 && input != 0)) {
            return false;
        }
        int reverse = 0;
        int original = input;
        while (input > 0) {
            reverse = reverse * 10 + input % 10;
            input = input / 10;
        }
        return original == reverse;
    }
}
