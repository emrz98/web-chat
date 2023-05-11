package com.emrz.chat.domain;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToMany;

@Entity
public class Message {

    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToMany
    private User UserFrom;

    @ManyToMany
    private User UserTo;

    private String message;

    public Message(){

    }
    public Message(User userFrom, User userTo, String message) {
        UserFrom = userFrom;
        UserTo = userTo;
        this.message = message;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUserFrom() {
        return UserFrom;
    }

    public void setUserFrom(User userFrom) {
        UserFrom = userFrom;
    }

    public User getUserTo() {
        return UserTo;
    }

    public void setUserTo(User userTo) {
        UserTo = userTo;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
