package com.thilaka.design.patterns.behavioural.command.mosh.example1.application1;

import com.thilaka.design.patterns.behavioural.command.mosh.example1.framework.Command;

public class AddCustomerCommand implements Command {
    private CustomerService customerService;

    public AddCustomerCommand(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Override
    public void execute() {
        customerService.addCustomer();
    }
}
