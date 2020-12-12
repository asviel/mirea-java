package ru.mirea.exercises.three.factories;

import ru.mirea.exercises.three.documents.MusicDocument;

public class CreateMusicDocument implements ICreateDocument {
    @Override
    public IDocument CreateNew() {
        return new MusicDocument();
    }

    @Override
    public IDocument CreateOpen() {
        return new MusicDocument();
    }
}
