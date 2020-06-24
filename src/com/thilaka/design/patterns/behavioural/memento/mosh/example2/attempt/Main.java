package com.thilaka.design.patterns.behavioural.memento.mosh.example2.attempt;

public class Main {
    public static void main(String[] args) {
        Document document = new Document();
        History history = new History();

        document.setContent("a");
        history.push(document.createState(document));

        document.setFontName("f1");
        history.push(document.createState(document));

        document.setFontSize(1);
        history.push(document.createState(document));

        document.setContent("b");
        history.push(document.createState(document));

        document.setContent("c");
        document.restore(history.pop());
        document.restore(history.pop());

        System.out.println(document);


    }
}
