package com.baloise.springfundamentals;

import com.baloise.springfundamentals.api.CustomerController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.baloise.springfundamentals")
public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Application.class);
        CustomerController customerController = applicationContext.getBean(CustomerController.class);
        customerController.deactivateCustomerAccount("1");
    }

}
