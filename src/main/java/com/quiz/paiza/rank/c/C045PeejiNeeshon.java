package com.quiz.paiza.rank.c;

import java.util.Scanner;

public class C045PeejiNeeshon{
    //70point 7/10
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] info = sc.nextLine().split(" ");

        int total = Integer.parseInt(info[0]);
        int numOfOnePage = Integer.parseInt(info[1]);
        int target = Integer.parseInt(info[2]);

        if (total == 0) {
            System.out.println("none");
            return;
        } else if ( total < numOfOnePage && target > 1) {
            System.out.println("none");
            return;
        } else if ( total >= numOfOnePage && target > total/numOfOnePage) {
            System.out.println("none");
            return;
        }

        int start = target == 1 ? 1 :(target-1)*numOfOnePage + 1;
        int end = target <= total/numOfOnePage ? start + numOfOnePage -1  : total;

        StringBuffer sb = new StringBuffer();

        for (int i = start; i <= end; i++) {
            sb.append(i + " ");
        }

        sb.setLength(sb.length()-1);
        System.out.println(sb);
    }
}
