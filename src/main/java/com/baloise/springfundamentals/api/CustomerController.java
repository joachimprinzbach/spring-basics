package com.baloise.springfundamentals.api;


import com.baloise.springfundamentals.domain.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    public void deactivateCustomerAccount(String customerId) {
        customerService.deactivateCustomer(customerId);
    }
}
