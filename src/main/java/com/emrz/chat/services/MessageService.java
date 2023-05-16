package com.emrz.chat.services;

import com.emrz.chat.dto.Message;

public interface MessageService {
    Boolean sendMessage(Message message);
}
