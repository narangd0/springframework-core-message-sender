package service;

import com.nhnacademy.edu.springframework.messagesender.MessageSender;
import com.nhnacademy.edu.springframework.messagesender.User;

public class MessageSendService {
    private MessageSender messageSender;

    public MessageSendService() {

    }

    public MessageSendService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void setMessageSender(MessageSender messageSender) {
        System.out.println("set messageSender by setMessageSender");
        this.messageSender = messageSender;
    }

    public void doSendMessage() {
        messageSender.sendMessage(new User("user-email-demo", "010-1234-5678"), "test message");
    }
}
