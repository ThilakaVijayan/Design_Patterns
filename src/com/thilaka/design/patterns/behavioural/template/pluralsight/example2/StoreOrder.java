package com.thilaka.design.patterns.behavioural.template.pluralsight.example2;

public class StoreOrder extends OrderTemplate{
    @Override
    public void doCheckout() {
        System.out.println("Ring up items from the cart");
    }

    @Override
    public void doPayment() {
        System.out.println("Process payment with Card present");
    }

    @Override
    public void doReceipt() {
        System.out.println("Print receipt");
    }

    @Override
    public void doDelivery() {
        System.out.println("Bag items at the counter");
    }
}
