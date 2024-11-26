package com.quiz.paiza.rank.c;

import java.util.*;

public class C043ShiyouKaisuuNoCyousa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String itemNum = sc.nextLine();
        String[] nums = sc.nextLine().split(" ");

        Map<String, Integer> map = new HashMap<>();
        int maxCount = 0;
        for (String num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > maxCount) {
                maxCount = map.get(num);
            }
        }

        if (maxCount == 0) return;

        StringBuilder sb = new StringBuilder();
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxCount) {
                list.add(Integer.parseInt(entry.getKey()));
            }
        }

        Collections.sort(list);
        for (Integer num : list) {
            sb.append(num).append(" ");
        }
        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }
}
