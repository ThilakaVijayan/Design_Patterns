package com.thilaka.design.patterns.behavioural.observer.mosh.example2.attempt;

import com.thilaka.design.patterns.behavioural.observer.mosh.example2.solution.StatusBar;
import com.thilaka.design.patterns.behavioural.observer.mosh.example2.solution.Stock;
import com.thilaka.design.patterns.behavioural.observer.mosh.example2.solution.StockListView;

public class Demo {
    public static void main(String[] args) {
        Demo.show();
    }

    public static void show() {
        var statusBar = new StatusBar();
        var stockListView = new StockListView();

        var stock1 = new com.thilaka.design.patterns.behavioural.observer.mosh.example2.solution.Stock("stock1", 10);
        var stock2 = new com.thilaka.design.patterns.behavioural.observer.mosh.example2.solution.Stock("stock2", 20);
        var stock3 = new Stock("stock3", 30);

        // The status bar shows the popular stocks
        statusBar.addStock(stock1);
        statusBar.addStock(stock2);

        // The stock view list shows all stocks
        stockListView.addStock(stock1);
        stockListView.addStock(stock2);
        stockListView.addStock(stock3);

        // Causes both statusBar and stockListView to get refreshed
        stock2.setPrice(21);

        // Causes only the stockListView to get refreshed. (statusBar
        // is not watching this stock.)
        stock3.setPrice(9);
    }
}
