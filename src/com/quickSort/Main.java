package com.quickSort;

import com.quickSort.QuickSort;

public class Main {
    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();

        int[] array = new int[] {5, 2, 6, 73, 234, 673, 43, 90, 9, 12, 1, 3, 2, 6, 0};

        for (int num : array) {
            System.out.print(num + " ");
        }

        quickSort.execute(array, 0, array.length - 1);

        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}