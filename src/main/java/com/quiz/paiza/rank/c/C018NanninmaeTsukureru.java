package com.quiz.paiza.rank.c;

import java.util.*;

public class C018NanninmaeTsukureru {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Map<String, Integer> recipeMap = new HashMap<String, Integer>();

        for (int i = 0; i < n; i++) {
            String[] recipeName = sc.nextLine().split(" ");
            recipeMap.put(recipeName[0], Integer.parseInt(recipeName[1]));
        }

        int stockQty = Integer.parseInt(sc.nextLine());
        Map<String, Integer> stockMap = new HashMap<>();
        for (int i = 0; i < stockQty; i++) {
            String[] stockName = sc.nextLine().split(" ");
            stockMap.put(stockName[0], Integer.parseInt(stockName[1]));
        }

        List<Integer> ansList = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : recipeMap.entrySet()) {
            String item = entry.getKey();
            int req = entry.getValue();

            int stock = stockMap.getOrDefault(item, 0);
            if (stock == 0) {
                ansList.add(0);
                continue;
            }
            ansList.add(stock / req);
        }

        int ans = ansList.get(0);

        for (int i = 0; i < ansList.size(); i++) {
            ans = Math.min(ans, ansList.get(i));
        }

        System.out.println(ans);
    }
}
