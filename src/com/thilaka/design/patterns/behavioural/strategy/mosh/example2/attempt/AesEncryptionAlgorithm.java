package com.thilaka.design.patterns.behavioural.strategy.mosh.example2.attempt;

public class AesEncryptionAlgorithm implements EncryptionAlgorithm {

    @Override
    public void encrypt(String message) {
        System.out.println("Encrypting message using AES");
    }
}
