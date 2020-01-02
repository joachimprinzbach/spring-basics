package com.baloise.springfundamentals.infrastructure;

import com.baloise.springfundamentals.domain.Customer;
import com.baloise.springfundamentals.domain.MailingAddress;

import java.util.HashMap;
import java.util.Map;

public class InMemoryDatabase {

    public static final Map<String, Customer> DATABASE = new HashMap<String, Customer>() {{
        put("1", new Customer("1", "Hans Wurst", new MailingAddress("Hauptstrasse 2", "Zürich"), "hans@wurst.ch"));
        put("2", new Customer("2", "Peter Peterson", new MailingAddress("Bahnhofsweg 100", "Bern"), "peter@peterson.ch"));
    }};
}
