package com.thilaka.design.patterns.behavioural.strategy.mosh.example2.attempt;

public class ChatClient {
    private EncryptionAlgorithm encryptionAlgorithm;

    public ChatClient(EncryptionAlgorithm encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
    }

    public void send(String message) {
        encryptionAlgorithm.encrypt(message);

        System.out.println("Sending the encrypted message...");
    }
}
