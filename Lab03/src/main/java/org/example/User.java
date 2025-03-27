package org.example;

public class User {
    private String name;

    public void createTicket(String title, String details) {
        Ticket ticket = new Ticket(title, details, this);
        Company.tickets.add(ticket);

    }
}
