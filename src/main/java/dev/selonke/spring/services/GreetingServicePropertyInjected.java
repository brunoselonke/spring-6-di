package dev.selonke.spring.services;

import org.springframework.stereotype.Service;

@Service("propertyGrettingService")
public class GreetingServicePropertyInjected implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Friends dont let friends do property injection!!!";
    }
}
