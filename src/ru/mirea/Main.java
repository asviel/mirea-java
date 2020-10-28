package ru.mirea;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] a = {6, 8, 5, 1, 9, 0, 13, -20};

        System.out.println(Arrays.toString(a));
        MergeSort.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
