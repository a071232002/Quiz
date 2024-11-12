package com.quiz.leetcode;

import java.util.HashSet;
import java.util.Set;

public class T0202HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> numMap = new HashSet<>();
        while (n != 1 && !numMap.contains(n)) {
            numMap.add(n);
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n = n / 10;
            }
            n = sum;
        }
        return n == 1;
    }

    public boolean isHappy2(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = sqr(slow);
            fast = sqr(sqr(fast));
        } while (slow != fast);

        return slow == 1;
    }

    private int sqr(int n) {
        int sum = 0;
        while (n > 0) {
            int dig = n % 10;
            sum += dig * dig;
            n /= 10;
        }
        return sum;
    }
}
