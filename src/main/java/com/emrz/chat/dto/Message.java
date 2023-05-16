package com.emrz.chat.dto;

import javax.persistence.criteria.CriteriaBuilder;
import java.io.Serializable;

public class Message implements Serializable {
    Integer userToSend;
    String message;

    public Integer getUserToSend() {
        return userToSend;
    }

    public void setUserToSend(Integer userToSend) {
        this.userToSend = userToSend;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
