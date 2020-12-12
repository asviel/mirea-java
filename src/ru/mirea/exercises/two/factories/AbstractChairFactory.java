package ru.mirea.exercises.two.factories;

import ru.mirea.exercises.two.chairs.FunctionalChair;
import ru.mirea.exercises.two.chairs.MagicChair;
import ru.mirea.exercises.two.chairs.VictorianChair;

public interface AbstractChairFactory {
    VictorianChair createVictorianChair();

    MagicChair createMagicanChair();

    FunctionalChair createFunctionalChair();
}
