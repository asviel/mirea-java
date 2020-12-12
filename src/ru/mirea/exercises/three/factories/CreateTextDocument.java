package ru.mirea.exercises.three.factories;

import ru.mirea.exercises.three.documents.TextDocument;

public class CreateTextDocument implements ICreateDocument {
    @Override
    public IDocument CreateNew() {
        return new TextDocument();
    }

    @Override
    public IDocument CreateOpen() {
        return new TextDocument();
    }
}
