package com.baloise.springfundamentals;

import com.baloise.springfundamentals.api.CustomerController;
import com.baloise.springfundamentals.domain.CustomerService;
import com.baloise.springfundamentals.domain.EmailService;
import com.baloise.springfundamentals.domain.PostalService;
import com.baloise.springfundamentals.infrastructure.CustomerLoader;

public class Application {

    public static void main(String[] args) {
        CustomerLoader customerLoader = new CustomerLoader();
        EmailService emailService = new EmailService();
        PostalService postalService = new PostalService();
        CustomerService customerService = new CustomerService(customerLoader, emailService, postalService);

        CustomerController customerController = new CustomerController(customerService);

        customerController.deactivateCustomerAccount("1");
    }

}
