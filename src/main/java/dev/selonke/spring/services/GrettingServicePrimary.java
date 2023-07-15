package dev.selonke.spring.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class GrettingServicePrimary implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello From the Primary Bean!! ";
    }
}
