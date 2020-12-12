package ru.mirea.exercises.two.factories;

import ru.mirea.exercises.two.chairs.FunctionalChair;
import ru.mirea.exercises.two.chairs.MagicChair;
import ru.mirea.exercises.two.chairs.VictorianChair;

public class ChairFactory implements AbstractChairFactory {
    @Override
    public VictorianChair createVictorianChair() {
        return new VictorianChair(42);
    }

    @Override
    public MagicChair createMagicanChair() {
        return new MagicChair();
    }

    @Override
    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }
}
