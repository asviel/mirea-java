package ru.mirea.exercises.three.factories;

import ru.mirea.exercises.three.documents.ImageDocument;

public class CreateImageDocument implements ICreateDocument {
    @Override
    public IDocument CreateNew() {
        return new ImageDocument();
    }

    @Override
    public IDocument CreateOpen() {
        return new ImageDocument();
    }
}
