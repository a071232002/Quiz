package com.quiz.paiza.rank.a;

import java.util.Scanner;

public class A086HakoNoNakaNoHebi {
    //DFS
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] size = sc.nextLine().split(" ");
        int h = Integer.parseInt(size[0]);
        int w = Integer.parseInt(size[1]);

        char[][] arr = new char[h][w];

        for (int i = 0; i < h; i++) {
            char[] item = sc.nextLine().toCharArray();
            for (int j = 0; j < w; j++) {
                arr[i][j] = item[j];
            }
        }

        boolean[][] visited = new boolean[h][w];
        int areaCount = 0;

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (arr[i][j] == '.' && !visited[i][j]) {
                    dfs(arr, visited, i, j);
                    areaCount++;
                }
            }
        }
        System.out.println(areaCount);
    }

    public static void dfs(char[][] arr, boolean[][] visited, int row, int col) {
        if (row < 0 || row >= arr.length || col < 0 || col >= arr[0].length || arr[row][col] != '.' || visited[row][col]) {
            return;
        }
        visited[row][col] = true;
        dfs(arr, visited, row -1, col);
        dfs(arr, visited, row + 1, col);
        dfs(arr, visited, row, col - 1);
        dfs(arr, visited, row, col + 1);
    }
}
