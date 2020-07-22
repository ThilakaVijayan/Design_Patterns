package com.thilaka.design.patterns.behavioural.observer.mosh.example2.attempt;

import com.thilaka.design.patterns.behavioural.observer.mosh.example2.attempt.framework.Observable;

public class Stock extends Observable {
    private String symbol;
    private float price;

    public Stock(String symbol, float price) {
        this.symbol = symbol;
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Stock{" +
                "symbol='" + symbol + '\'' +
                ", price=" + price +
                '}';
    }
}
