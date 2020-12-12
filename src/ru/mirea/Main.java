package ru.mirea;

import ru.mirea.exercises.one.Application;
import ru.mirea.exercises.one.ConcreteFactory;
import ru.mirea.exercises.two.Client;
import ru.mirea.exercises.two.chairs.Chair;
import ru.mirea.exercises.two.chairs.VictorianChair;
import ru.mirea.exercises.two.factories.AbstractChairFactory;
import ru.mirea.exercises.two.factories.ChairFactory;

public class Main {

    public static void runExerciseOne() {
        Application app = new Application(new ConcreteFactory());

        app.init();

        System.out.println(app.getComplexNumber());
    }

    public static void runExerciseTwo() {
        AbstractChairFactory factory = new ChairFactory();
        Client client = new Client();

        client.setChair(factory.createVictorianChair());
        client.sit();

        client.setChair(factory.createMagicanChair());
        client.sit();
    }

    public static void runExerciseThree() {
        try {
            ru.mirea.exercises.three.app.Application app = new ru.mirea.exercises.three.app.Application("text");

            app.newDocument();
            app.getCurrentDocument();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }


    public static void main(String[] args) {
        System.out.println("-------------\nRunning exercise one...");
        runExerciseOne();
        System.out.println("Exercise one is done!\n-------------\n");

        System.out.println("-------------\nRunning exercise two...");
        runExerciseTwo();
        System.out.println("Exercise two is done!\n-------------\n");

        System.out.println("-------------\nRunning exercise three...");
        runExerciseThree();
        System.out.println("Exercise three is done!\n-------------\n");
    }
}
