package com.quiz.paiza.rank.c;

import java.util.*;

public class C159TousenTsuuchi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        String secondLine = sc.nextLine();
        String[] nums = secondLine.split(" ");
        List<String> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }

        String thirdLine = sc.nextLine();
        String[] number = thirdLine.split(" ");
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < number.length; i++) {
            map.put(i + 1, number[i]);
        }

        List<Integer> matchingKeys = new ArrayList<>();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (list.contains(entry.getValue())) {
                matchingKeys.add(entry.getKey());
            }
        }

        if (matchingKeys.isEmpty()) {
            System.out.println(-1);
        } else {
            for (Integer key : matchingKeys) {
                System.out.println(key);
            }
        }
    }
}
