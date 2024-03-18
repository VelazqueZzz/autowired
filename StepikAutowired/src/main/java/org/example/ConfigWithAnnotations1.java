package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person =context.getBean("personBean",Person.class);
        person.callYourPet();
    }
}
