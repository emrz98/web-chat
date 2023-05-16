package com.emrz.chat.controller;

import com.emrz.chat.dto.Message;
import com.emrz.chat.repository.MessageRepository;
import com.emrz.chat.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/messages")
public class MessageController {

    @Autowired
    private MessageService messageService;


    @PostMapping(value = "/sendMessage")
    public ResponseEntity<?> sendMessage(@RequestBody Message message){
        Map<String, Object> response = new HashMap<>();
        Boolean result = messageService.sendMessage(message);
        if(result){
            response.put("result", "Tu mensaje fue enviado exitosamente");
        } else {
            response.put("result", "Error al enviar el mensaje");
        }

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}

