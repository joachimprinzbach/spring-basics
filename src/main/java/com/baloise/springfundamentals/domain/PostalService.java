package com.baloise.springfundamentals.domain;

import org.springframework.stereotype.Component;

@Component
public class PostalService {

    public void sendLetter(MailingAddress mailingAddress, String message) {
        System.out.println("A letter with the message '" + message + "' will be sent to " + mailingAddress);
    }
}
