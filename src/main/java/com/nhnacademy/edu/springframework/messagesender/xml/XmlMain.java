package com.nhnacademy.edu.springframework.messagesender.xml;

import com.nhnacademy.edu.springframework.messagesender.MessageSender;
import com.nhnacademy.edu.springframework.messagesender.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.MessageSendService;

public class XmlMain {
    public static void main(String[] args) {
        String location = "classpath:/beans.xml";
        User user = new User("b@b.com", "010");

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(location);

        context.getBean("smsMessageSender", MessageSender.class).sendMessage(user, "test message");
        context.getBean("smsMessageSender", MessageSender.class).sendMessage(user, "test message");

        System.out.println("--------------------");

        context.getBean("emailMessageSender", MessageSender.class).sendMessage(user, "test message");
        context.getBean("emailMessageSender", MessageSender.class).sendMessage(user, "test message");

//        System.gc();
        context.close();
    }

}
