package com.baloise.springfundamentals.api;


import com.baloise.springfundamentals.domain.CustomerService;

public class CustomerController {

    public void deactivateCustomerAccount(String customerId) {
        CustomerService customerService = new CustomerService();
        customerService.deactivateCustomer(customerId);
    }
}
