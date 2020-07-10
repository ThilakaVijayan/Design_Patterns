package com.thilaka.design.patterns.behavioural.strategy.mosh.example2.attempt;

public class Main {
    public static void main(String[] args) {
        var chatClient = new ChatClient(new AesEncryptionAlgorithm());
        chatClient.send("a");

    }
}
