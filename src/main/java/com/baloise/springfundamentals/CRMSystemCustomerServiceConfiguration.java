package com.baloise.springfundamentals;

import com.baloise.springfundamentals.othersystemjarcontent.CRMSystemCustomerService;
import com.baloise.springfundamentals.othersystemjarcontent.CRMSystemCustomerServiceAPIClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class CRMSystemCustomerServiceConfiguration {

    @Bean
    @Profile("prod")
    public CRMSystemCustomerService getCRMCustomerService() {
        return new CRMSystemCustomerServiceAPIClient();
    }

    @Bean
    @Profile({"mock", "default"})
    public CRMSystemCustomerService getCRMCustomerServiceMock() {
        return new CRMSystemCustomerService() {
            @Override
            public void callMe() {
                System.out.println("Local Mock");
            }
        };
    }
}
