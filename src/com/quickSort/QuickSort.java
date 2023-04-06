package com.quickSort;

public class QuickSort {
    protected void execute(int[] list, int beginning, int end) {
        if (beginning < end) {
            int pivot = this.partition(list, beginning, end);
            this.execute(list, beginning, pivot - 1);
            this.execute(list, pivot + 1, end);
        }
    }

    private int partition (int[] list, int beginning, int end) {
        int pivot = list[end];
        int index = beginning;

        for (int j = index; j < end; j++) {
            if (list[j] <= pivot) {
                int temp = list[j];
                list[j] = list[index];
                list[index] = temp;
                index++;
            }
        }

        int temp = list[index];
        list[index] = list[end];
        list[end] = temp;
        return index;
    }
}

