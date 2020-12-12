package ru.mirea.exercises.three.documents;

import ru.mirea.exercises.three.factories.IDocument;

public class TextDocument implements IDocument {
    public TextDocument() {
        System.out.println("New TextDocument is created!");
    }
}
