package com.thilaka.design.patterns.behavioural.template.mosh.example2.solution;

public class ChatWindow extends Window {
    @Override
    protected void onClosed() {
        System.out.println("Disconnecting from the server...");
    }
}
