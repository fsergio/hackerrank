package com.hackerrank.hackerrank.practice.algorithms.dataStructures;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {
    private List<List<Integer>> matrixSquare = new ArrayList<List<Integer>>();

    public DiagonalDifference() {
        this.solution();
    }

    public void solution() {
        List<Integer> list1 = new ArrayList<>();
        list1.add(11);
        list1.add(2);
        list1.add(4);

        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        List<Integer> list3 = new ArrayList<>();
        list3.add(10);
        list3.add(8);
        list3.add(-12);

        matrixSquare.add(list1);
        matrixSquare.add(list2);
        matrixSquare.add(list3);
        System.out.println("-----------------------------------------------------------------------------------------");
        for (List<Integer> integers : matrixSquare) {
            for (Integer element : integers) {
                System.out.printf("%d ", element);
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
