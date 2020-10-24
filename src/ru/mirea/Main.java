package ru.mirea;

public class Main {

    public static void main(String[] args) {
        MovableCircle a = new MovableCircle(0, 0, 2, 1, 4);

        System.out.println(a);

        a.moveLeft();
        a.moveUp();

        System.out.println(a);
    }
}
