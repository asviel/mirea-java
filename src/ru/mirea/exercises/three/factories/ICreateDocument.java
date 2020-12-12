package ru.mirea.exercises.three.factories;

public interface ICreateDocument {
    IDocument CreateNew();

    IDocument CreateOpen();
}
