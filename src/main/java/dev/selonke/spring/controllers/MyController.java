package dev.selonke.spring.controllers;

import dev.selonke.spring.services.GreetingService;
import dev.selonke.spring.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello(){
        System.out.println("Im in the controller");
        return greetingService.sayGreeting();
    }
}
