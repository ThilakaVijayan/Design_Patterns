package com.thilaka.design.patterns.behavioural.command.mosh.example1.application1;

import com.thilaka.design.patterns.behavioural.command.mosh.example1.framework.Button;

public class Main {
    public static void main(String[] args) {
        var customerService = new CustomerService();
        var command = new AddCustomerCommand(customerService);
        var button = new Button(command);

        button.click();


        //customerService.addCustomer();
    }
}
