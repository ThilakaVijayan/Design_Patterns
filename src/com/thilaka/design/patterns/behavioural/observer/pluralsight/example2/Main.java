package com.thilaka.design.patterns.behavioural.observer.pluralsight.example2;

public class Main {
    public static void main(String[] args) {
        Subject subject = new MessageStream();
        var phoneClient = new PhoneClient(subject);
        var tabletClient = new TabletClient(subject);

        phoneClient.addMessage("Here is a new message!");
        tabletClient.addMessage("Another new message!");

    }
}
