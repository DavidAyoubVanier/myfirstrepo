package org.example;

import java.time.LocalDateTime;

public class Ticket {
    private int id;
    private String title;
    private String details;
    private User creator;
    private LocalDateTime createdTime;
    private Tech handler;

    private static int nextId = 1;

    public Ticket(String title, String details, User creator) {
        this.id = nextId++;
        this.title = title;
        this.details = details;
        this.creator = creator;
        this.createdTime = LocalDateTime.now();
    }

    public void setHandler(Tech handler) {
        this.handler = handler;
    }
}
