package ru.mirea;

public class Exercise9 {
    public int solve(int a, int b) {
        if (a == 0) return 1;
        if (a == 1) return b + 1;
        if (a > 1 && b == 0) return 0;

        return solve(a - 1, b - 1) + solve(a, b - 1);
    }
}
