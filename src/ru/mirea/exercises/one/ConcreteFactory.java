package ru.mirea.exercises.one;

public class ConcreteFactory implements ComplexAbstractFactory {
    @Override
    public Complex createComplex() {
        return new ComplexNumber();
    }

    @Override
    public Complex CreateComplex(int real, int image) {
        return new ComplexNumber(real, image);
    }
}
