package com.emrz.chat.consumer;

import com.emrz.chat.dto.Message;

public interface MessageConsumer {
    void messageReceiver(Message message);
}
