package com.nhnacademy.edu.springframework.messagesender;

public class SmsMessageSender implements MessageSender {
    public SmsMessageSender() {
        System.out.println("* SmsMessageSender is created.");
    }

    public void init() {
        System.out.println("* SmsMessageSender initializing...");
    }

    public void destroy() {
        System.out.println("- destroy method called in SmsMessageSender");
    }
    @Override
    public void sendMessage(User user, String message) {
        System.out.println("SMS Message Sent to " + user.getPhoneNumber() + " : " + message);
    }
}
