package com.baloise.springfundamentals;

import com.baloise.springfundamentals.api.CustomerController;

public class Application {

    public static void main(String[] args) {
        CustomerController customerController = new CustomerController();

        customerController.deactivateCustomerAccount("2");
    }

}
