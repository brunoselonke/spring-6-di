package dev.selonke.spring;

import dev.selonke.spring.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class ApplicationTests {

    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    MyController myController;

    @Test
    void testAutoWiredOfController(){
        System.out.println(myController.sayHello());
    }
    @Test
    void testGetControolerFromCtx(){
        MyController myController = applicationContext.getBean(MyController.class);

        System.out.println(myController.sayHello());
    }
    @Test
    void contextLoads() {
    }

}
