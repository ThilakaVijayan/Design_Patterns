package com.thilaka.design.patterns.behavioural.observer.mosh.example2.attempt;

import com.thilaka.design.patterns.behavioural.observer.mosh.example2.attempt.framework.Observer;

import java.util.ArrayList;
import java.util.List;

public class StatusBar implements Observer {
    private List<Stock> stocks = new ArrayList<>();

    public void addStock(Stock stock) {
        stocks.add(stock);
        stock.addObserver(this);
    }

    public void show() {
        for (var stock : stocks)
            System.out.println(stock);
    }

    @Override
    public void update() {
        show();
    }
}
