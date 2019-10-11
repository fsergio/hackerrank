package com.hackerrank.hackerrank.util;

public class Util {
    public void printMatrixSquare(int[][] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i ++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}
