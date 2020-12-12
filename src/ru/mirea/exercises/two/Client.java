package ru.mirea.exercises.two;

import ru.mirea.exercises.two.chairs.Chair;

public class Client {
    public Chair chair;

    public void sit() {
    System.out.println("I'm sitting down on the " + chair.getClass().getSimpleName());
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }

}
