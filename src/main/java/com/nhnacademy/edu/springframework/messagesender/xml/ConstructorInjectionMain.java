package com.nhnacademy.edu.springframework.messagesender.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.MessageSendService;

public class ConstructorInjectionMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:/beans.xml");
        MessageSendService service = context.getBean("messageSenderService", MessageSendService.class);
        service.doSendMessage();
    }
}
