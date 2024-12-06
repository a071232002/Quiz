package com.quiz.paiza.rank.c;

import java.util.Scanner;

public class C005AdoresuCyousa {
    //75point 2miss root cause not found
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String[] line = sc.nextLine().split("\\.");

            boolean pass = true;

            if (line.length != 4 ) {
                pass = false;
            } else {
                for (int j = 0; j < 4; j++) {
                    String str = line[j];
                    if (str.isEmpty() || Integer.parseInt(str) < 0  || Integer.parseInt(str) > 255) {
                        pass = false;
                        break;
                    }
                }
            }

            if (pass)
                System.out.println("True");
            else
                System.out.println("False");
        }
    }
}
