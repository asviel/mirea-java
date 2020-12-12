package ru.mirea.exercises.three.app;

import ru.mirea.exercises.three.documents.TextDocument;
import ru.mirea.exercises.three.factories.CreateTextDocument;
import ru.mirea.exercises.three.factories.ICreateDocument;
import ru.mirea.exercises.three.factories.IDocument;

public class Application {
    IDocument document;
    ICreateDocument createDocument;

    public Application(String appType) {
        if (appType.equals("text")) {
            createDocument = new CreateTextDocument();
        } else {
            throw new NullPointerException("Currently only \"text\" type is supported.");
        }
    }

    public void newDocument() {
        document = createDocument.CreateNew();
    }

    public void openDocument() {
        document = createDocument.CreateOpen();
    }

    public void getCurrentDocument() {
        System.out.println("Current document is " + document.getClass().getSimpleName());
    }

}
