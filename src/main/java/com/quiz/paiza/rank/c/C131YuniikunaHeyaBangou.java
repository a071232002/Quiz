package com.quiz.paiza.rank.c;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C131YuniikunaHeyaBangou {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int min = Integer.parseInt(str[0]);
        int max = Integer.parseInt(str[1]);

        int ans = 0;

        for (int i = min; i <= max; i++) {
            String ori = String.valueOf(i);
            StringBuilder sb = new StringBuilder();

            for (char c : ori.toCharArray()) {
                if (c == '0' || c == '1' || c == '8') {
                    sb.append(c);
                } else if (c == '6') {
                    sb.append('9');
                } else if (c == '9') {
                    sb.append('6');
                } else {
                    break;
                }
            }

            if(ori.equals(sb.reverse().toString())){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
