package dev.selonke.spring.controllers;

import dev.selonke.spring.services.GreetingService;

public class SetterInjectedController {
    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String sayHelo(){
        return greetingService.sayGreeting();
    }

}
