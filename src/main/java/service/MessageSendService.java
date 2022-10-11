package service;

import com.nhnacademy.edu.springframework.messagesender.MessageSender;
import com.nhnacademy.edu.springframework.messagesender.User;

public class MessageSendService {
    private final MessageSender messageSender;

    public MessageSendService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void doSendMessage() {
        messageSender.sendMessage(new User("email", "010"), "test message");
    }
}
