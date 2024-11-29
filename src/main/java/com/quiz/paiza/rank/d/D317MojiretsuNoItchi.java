package com.quiz.paiza.rank.d;

import java.util.Scanner;

public class D317MojiretsuNoItchi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();

        if (word1.equals(word2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
