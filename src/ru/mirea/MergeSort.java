package ru.mirea;

public class MergeSort {
    public static void sort(int[] array) {
        mergeSort(array, array.length);
    }

    private static void mergeSort(int[] array, int length) {
        if (array == null) return;
        if (length < 2) return;

        int mid = length / 2;
        int[] left = new int[mid];
        int[] right = new int[length - mid];

        System.arraycopy(array, 0, left, 0, mid);
        System.arraycopy(array, mid, right, 0, length - mid);

        mergeSort(left, mid);
        mergeSort(right, length - mid);

        merge(array, left, right, mid, length - mid);
    }

    private static void merge(int[] array, int[] left, int[] right, int left_length, int right_length) {
        int i = 0, j = 0, k = 0;

        while (i < left_length && j < right_length) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        while (i < left_length) {
            array[k++] = left[i++];
        }

        while (j < right_length) {
            array[k++] = right[j++];
        }
    }
}
