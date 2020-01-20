package com.baloise.springfundamentals.domain;

import com.baloise.springfundamentals.infrastructure.CustomerLoader;
import com.baloise.springfundamentals.othersystemjarcontent.CRMSystemCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private static final String DEACTIVATION_MESSAGE = "Your customer account has been successfully removed";
    private final CustomerLoader customerLoader;
    private final EmailService emailService;
    private final PostalService postalService;
    private final CRMSystemCustomerService crmSystemCustomerService;

    @Autowired
    public CustomerService(CustomerLoader customerLoader, EmailService emailService, PostalService postalService, CRMSystemCustomerService crmSystemCustomerService) {
        this.customerLoader = customerLoader;
        this.emailService = emailService;
        this.postalService = postalService;
        this.crmSystemCustomerService = crmSystemCustomerService;
    }

    public void deactivateCustomer(String customerId) {
        Customer customer = customerLoader.findById(customerId);
        crmSystemCustomerService.callMe();

        if (customer.hasEmailAddress()) {
            String emailAddress = customer.getEmailAddress();
            emailService.send(emailAddress, "Customer Account", DEACTIVATION_MESSAGE);
        }

        postalService.sendLetter(customer.getMailingAddress(), DEACTIVATION_MESSAGE);
    }
}
