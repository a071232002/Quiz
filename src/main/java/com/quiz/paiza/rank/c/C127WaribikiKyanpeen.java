package com.quiz.paiza.rank.c;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C127WaribikiKyanpeen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int x = Integer.parseInt(s[0]);
        int days = Integer.parseInt(s[1]);

        String[] records = new String[days];
        for (int i = 0; i < days; i++) {
            records[i] = sc.nextLine();
        }

        List<String> targets = new ArrayList<>();
        for (int i = 0; i < days - x; i++) {
            if (!targets.contains(records[i])) {
                targets.add(records[i]);
            }
        }

        int ans = 0;
        boolean found;

        for (int i = 0; i < targets.size(); i++) {
            found = true;
            for (int j = days - x; j < days; j++) {
                if (targets.get(i).equals(records[j])) {
                    found = false;
                }
            }
            if (found) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
