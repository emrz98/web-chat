package com.emrz.chat.consumer;

import com.emrz.chat.dto.Message;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumerImpl implements MessageConsumer  {

    @KafkaListener(topics = "t-message")
    @Override
    public void messageReceiver(Message message) {
        System.out.println(message.getMessage());
    }

}


