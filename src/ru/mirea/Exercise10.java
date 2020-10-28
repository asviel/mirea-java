package ru.mirea;

public class Exercise10 {
    public int solve(int number) {
        if (number >= 10) {
            return Integer.parseInt(Integer.toString(number % 10) + solve(number / 10));
        }

        return number;
    }
}
