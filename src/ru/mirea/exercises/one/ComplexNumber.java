package ru.mirea.exercises.one;

public class ComplexNumber implements Complex {
    private int real, image;

    public ComplexNumber() {
    }

    public ComplexNumber(int real, int image) {
        this.real = real;
        this.image = image;
    }

    @Override
    public String toString() {
        return real + "+" + image + "i";
    }
}
