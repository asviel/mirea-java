package ru.mirea;

import java.util.Scanner;

public class Exercise11 {
    public int solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 1) {
            int m = sc.nextInt();
            if (m == 1) {
                return solve() + n + m;
            } else {
                int k = sc.nextInt();
                if (k == 1) {
                    return solve() + n + m + k;
                } else {
                    return n + m + k;
                }
            }
        } else {
            int m = sc.nextInt();
            if (m == 1) {
                return solve() + n + m;
            } else {
                return n + m;
            }
        }
    }
}
