package com.quiz.paiza.rank.c;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class C031JisaOMotometai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums = Integer.parseInt(sc.nextLine());

        Map<String, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < nums; i++) {
            String[] line = sc.nextLine().split(" ");
            map.put(line[0], Integer.parseInt(line[1]));
        }

        String[] line = sc.nextLine().split(" ");
        String str = line[0];
        LocalTime time = LocalTime.parse(line[1]);

        int hour = map.get(str);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (hour == entry.getValue()) {
                System.out.println(time);
            } else if (hour > entry.getValue()) {
                LocalTime newTime = time.minusHours(hour - entry.getValue());
                System.out.println(newTime);
            } else {
                LocalTime newTime = time.plusHours(entry.getValue() - hour);
                System.out.println(newTime);
            }
        }
    }
}
