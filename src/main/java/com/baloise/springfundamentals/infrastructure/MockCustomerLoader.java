package com.baloise.springfundamentals.infrastructure;

import com.baloise.springfundamentals.domain.Customer;
import com.baloise.springfundamentals.domain.MailingAddress;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class MockCustomerLoader implements CustomerLoader {

    @Override
    public Customer findById(String customerId) {
        System.out.println("mocked loader");
        return new Customer("id", "name", new MailingAddress("street", "city"), "mail");
    }
}
