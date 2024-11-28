package com.quiz.paiza.rank.c;

import java.util.Scanner;

public class C132SoujiRobotto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int roomNum = Integer.parseInt(sc.nextLine());
        int move = Integer.parseInt(sc.nextLine());

        while (move != 0) {
            int temp = move;
            move = roomNum % move;
            roomNum = temp;
        }

        if (roomNum == 1) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
