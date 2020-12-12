package ru.mirea.exercises.one;

public class Application {
    private ComplexAbstractFactory factory;
    private Complex complexNumber;

    public Application(ComplexAbstractFactory factory) {
        this.factory = factory;
    }

    public void init() {
        complexNumber = factory.CreateComplex(7, 3);
    }

    public Complex getComplexNumber() {
        return complexNumber;
    }
}
