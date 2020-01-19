package com.baloise.springfundamentals.infrastructure;

import com.baloise.springfundamentals.domain.Customer;

public interface CustomerLoader {

    public Customer findById(String customerId);
}
