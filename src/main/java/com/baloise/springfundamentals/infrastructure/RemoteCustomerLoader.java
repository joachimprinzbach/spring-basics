package com.baloise.springfundamentals.infrastructure;

import com.baloise.springfundamentals.domain.Customer;
import org.springframework.stereotype.Repository;

@Repository
public class RemoteCustomerLoader implements CustomerLoader {

    @Override
    public Customer findById(String customerId) {
        return null;
    }
}
