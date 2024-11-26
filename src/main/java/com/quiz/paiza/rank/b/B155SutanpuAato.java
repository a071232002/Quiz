package com.quiz.paiza.rank.b;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B155SutanpuAato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] parts = str.split(" ");
        int stampH = Integer.parseInt(parts[0]);
        int stampQty = Integer.parseInt(parts[2]);

        List<String[][]> list = new ArrayList<>();
        for (int n = 0; n < stampQty; n++) {
            String[][] strArr = new String[stampH][1];
            for (int i = 0; i < stampH; i++) {
                strArr[i][0] = sc.nextLine();
            }
            list.add(strArr);
        }

        String[] size = sc.nextLine().split(" ");
        int masuH = Integer.parseInt(size[0]);
        int masuW = Integer.parseInt(size[1]);
        int[][] masuArr = new int[masuH][masuW];
        for(int i = 0; i < masuH; i++) {
            String[] stampPickNumsNums = sc.nextLine().split(" ");
            for(int j = 0; j < masuW; j++) {
               masuArr[i][j] = Integer.parseInt(stampPickNumsNums[j]);
            }
        }

        for(int i = 0; i < masuArr.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int k = 0; k < stampH; k++) {
                for(int j = 0; j < masuArr[i].length; j++) {
                    int pickIndex = masuArr[i][j] - 1;
                    String[][] target = list.get(pickIndex);
                    sb.append(target[k][0]);
                }
                System.out.println(sb);
                sb.setLength(0);
            }
        }
    }
}
