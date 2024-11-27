package com.quiz.paiza.rank.c;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C065SuujiAteGeemu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = 1;
        int max = Integer.MAX_VALUE;
        List<Integer> list = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String[] str = sc.nextLine().split(" ");
            String s = str[0];
            int x = Integer.parseInt(str[1]);
            switch (s) {
                case ">" -> min = min < x + 1 ? x + 1 : min;
                case "<" -> max = max > x - 1 ? x - 1 : max;
                case "/" -> list.add(x);
            }
        }

        List<Integer> ansList = new ArrayList<>();
        boolean found;
        while (min <= max) {
            found = true;
            for (int num : list) {
                if (min % num != 0) {
                    found = false;
                    break;
                }
            }

            if (found)
            ansList.add(min);

            min++;
        }
        for (int ans : ansList) {
            System.out.println(ans);
        }
    }
}
