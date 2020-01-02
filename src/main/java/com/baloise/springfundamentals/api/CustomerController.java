package com.baloise.springfundamentals.api;


import com.baloise.springfundamentals.domain.CustomerService;

public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    public void deactivateCustomerAccount(String customerId) {
        customerService.deactivateCustomer(customerId);
    }
}
