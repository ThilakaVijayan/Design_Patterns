package com.thilaka.design.patterns.behavioural.observer.pluralsight.example1;



public class Main {
    public static void main(String[] args) {
        var messageStream = new TwitterStream();
        var client1 = new Client("Bryan");
        var client2 = new Client("Mark");
        messageStream.addObserver(client1);
        messageStream.addObserver(client2);

        messageStream.someoneTweeted();
    }
}
