package ru.mirea;

public class Main {

    public static void main(String[] args) {
        Exercise9 ex9 = new Exercise9();
        Exercise10 ex10 = new Exercise10();
        Exercise11 ex11 = new Exercise11();

        System.out.println("Exercise 9 input: 3, 4");
        System.out.println("Exercise 9 answer: " + ex9.solve(3, 4));
        System.out.println("---");

        System.out.println("Exercise 10 input: 123456789");
        System.out.println("Exercise 10 answer: " + ex10.solve(123456789));
        System.out.println("---");

        System.out.println("Enter 0 or 1 while you enjoy it)");
        System.out.println("Exercise 11 answer: " + ex11.solve());
    }
}
