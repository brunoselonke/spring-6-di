package dev.selonke.spring.services.i18n;

import dev.selonke.spring.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("ES")
@Service("i18NService")
public class SpanishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hola que tal Mundo";
    }
}
