package com.hackerrank.hackerrank.practice.algorithms.dataStructures;

import com.hackerrank.hackerrank.util.Util;

public class DiagonalDifference  extends Util {

    public DiagonalDifference() {
        this.solution();
    }

    public void solution() {
        int arr[][] = {
                        {11, 2, 4},
                        {4 , 5, 6},
                        {10, 8, -12}
                      };
        int n = arr.length;
        int left = 0;
        int right = 0;

        this.printMatrixSquare(arr);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    left = left + arr[i][j];
                }

                if (j == (n - 1) - i) {
                    right = right + arr[i][j];
                }
            }
        }

        System.out.println("Diagonal difference: " + Math.abs(left - right));
    }
}
