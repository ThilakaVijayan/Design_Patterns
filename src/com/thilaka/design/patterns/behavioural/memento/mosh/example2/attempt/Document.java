package com.thilaka.design.patterns.behavioural.memento.mosh.example2.attempt;


public class Document implements Cloneable{
    private String content;
    private String fontName;
    private int fontSize;

    public Document() {
    }

    public Document(String content, String fontName, int fontSize) {
        this.content = content;
        this.fontName = fontName;
        this.fontSize = fontSize;
    }


    public DocumentState createState(Document document){
        Document state = null;
        try {
            state = document.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return new DocumentState(state);
    }

    public void restore(DocumentState state){
        content = state.getDocument().content;
        fontName = state.getDocument().fontName;
        fontSize = state.getDocument().fontSize;
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    @Override
    protected Document clone() throws CloneNotSupportedException{
       return (Document) super.clone();
    }

    @Override
    public String toString() {
        return "Document{" +
                "content='" + content + '\'' +
                ", fontName='" + fontName + '\'' +
                ", fontSize=" + fontSize +
                '}';
    }
}
