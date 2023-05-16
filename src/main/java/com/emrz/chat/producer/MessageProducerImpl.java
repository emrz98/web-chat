package com.emrz.chat.producer;

import com.emrz.chat.dto.Message;
import com.fasterxml.jackson.databind.JsonSerializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageProducerImpl implements MessageProducer{
    @Autowired
    private KafkaTemplate<String, Message> template;

    @Override
    public void sendMessageKafka(Message message) {
        template.send("t-message", message);
    }
}
