package com.quiz.paiza.rank.c;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Scanner;

public class C006HaisukoaRakingu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] info = sc.nextLine().split(" ");
        int items = Integer.parseInt(info[0]);
        int presons = Integer.parseInt(info[1]);
        int pickNum = Integer.parseInt(info[2]);

        String[] itemScoresInfo = sc.nextLine().split(" ");
        double[] itemScores = new double[items];
        for (int i = 0; i < items; i++) {
            itemScores[i] = Double.parseDouble(itemScoresInfo[i]);
        }

        int[] totalScores = new int[presons];
        for (int i = 0; i < presons; i++) {
            String[] itemNumInfo = sc.nextLine().split(" ");
            double total = 0;
            for (int j = 0; j < items; j++) {
                double num = Double.parseDouble(itemNumInfo[j]);
                total += itemScores[j]*num;
            }
            totalScores[i] = BigDecimal.valueOf(total)
                                       .setScale(0, RoundingMode.HALF_UP)
                                       .intValue();
        }

        Arrays.sort(totalScores);

        for (int i = presons -1 ; i >= presons - pickNum ; i--) {
            System.out.println(totalScores[i]);
        }
    }
}
