package com.emrz.chat.producer;

import com.emrz.chat.dto.Message;

public interface MessageProducer {
    void sendMessageKafka(Message message);
}
