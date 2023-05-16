package com.emrz.chat.services;

import com.emrz.chat.dto.Message;
import com.emrz.chat.producer.MessageProducer;
import com.emrz.chat.repository.MessageRepository;
import org.apache.kafka.common.KafkaException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageProducer messageProducer;

    @Override
    public Boolean sendMessage(Message message) {
        try{
            messageProducer.sendMessageKafka(message);
        } catch (KafkaException kafkaException){
            System.out.println(kafkaException.getMessage());
            return false;
        }
        return true;
    }
}
