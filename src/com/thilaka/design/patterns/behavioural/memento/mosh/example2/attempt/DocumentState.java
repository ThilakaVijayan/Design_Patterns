package com.thilaka.design.patterns.behavioural.memento.mosh.example2.attempt;

public class DocumentState {
    private final Document document;

    public DocumentState(Document document) {
        this.document = document;
    }

    public Document getDocument() {
        return document;
    }
}
