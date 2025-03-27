package org.example;

public class Tech extends User {

    public void handleTicket() {
        Ticket ticket = Company.tickets.poll();
        ticket.setHandler(this);

    }
}
