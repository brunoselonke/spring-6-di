package dev.selonke.spring.controllers;

import dev.selonke.spring.services.GreetingService;

public class ConstructorInjectedController {
    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
       return greetingService.sayGreeting();
    }
}
