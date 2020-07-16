package com.thilaka.design.patterns.behavioural.command.mosh.example2.undo.mechanism.editor;

public class HtmlDocument {
    private String content;

    public void makeBold(){
        content = "<b>" + content + "</b>";
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
