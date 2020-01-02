package com.baloise.springfundamentals.infrastructure;

import com.baloise.springfundamentals.domain.Customer;

public class CustomerLoader {

    public Customer findById(String customerId) {
        return InMemoryDatabase.DATABASE.get(customerId);
    }
}
