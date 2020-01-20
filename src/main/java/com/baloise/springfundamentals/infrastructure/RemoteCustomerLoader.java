package com.baloise.springfundamentals.infrastructure;

import com.baloise.springfundamentals.domain.Customer;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
public class RemoteCustomerLoader implements CustomerLoader {

    @Override
    public Customer findById(String customerId) {
        System.out.println("Remote loader");
        return null;
    }
}
