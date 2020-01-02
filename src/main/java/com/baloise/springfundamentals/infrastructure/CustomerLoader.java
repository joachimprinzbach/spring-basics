package com.baloise.springfundamentals.infrastructure;

import com.baloise.springfundamentals.domain.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerLoader {

    public Customer findById(String customerId) {
        return InMemoryDatabase.DATABASE.get(customerId);
    }
}
