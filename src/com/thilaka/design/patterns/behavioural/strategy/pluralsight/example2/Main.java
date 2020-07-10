package com.thilaka.design.patterns.behavioural.strategy.pluralsight.example2;

public class Main {
    public static void main(String[] args) {
        var amexCard = new CreditCard(new AmexStrategy());
        amexCard.setNumber("374601250952945");
        amexCard.setDate("04/2020");
        amexCard.setCvv("123");

        System.out.println("Is Amex valid: " + amexCard.isValid());

        var amexCard2 = new CreditCard(new AmexStrategy());
        amexCard2.setNumber("274601250952945");
        amexCard2.setDate("04/2020");
        amexCard2.setCvv("123");

        System.out.println("Is Amex valid: " + amexCard2.isValid());

        var visaCard = new CreditCard(new VisaStrategy());
        visaCard.setNumber("4485579023196305");
        visaCard.setDate("04/2020");
        visaCard.setCvv("123");

        System.out.println("Is Visa valid: " + visaCard.isValid());
    }
}
