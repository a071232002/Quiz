package com.quiz.leetcode;

public class T0121BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            } else if (prices[i] - buy > profit) {
                profit = prices[i] - buy;
            }
        }
        return profit;
    }

    public int maxProfit2(int[] prices) {
        int min = prices[0];
        int profit = 0;
        for (int i : prices) {
            if (min > i) {
                min = i;
            }
            int diff = i - min;
            profit = profit > diff ? profit : diff;
        }
        return profit;
    }
}
