package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Technician extends User {
    private List<Ticket> onGoingTickets;


    public Technician(String name, Gender gender) {
        super(name, gender);
        onGoingTickets = new ArrayList<>();
    }

    public void fetchNewTicket() {
        //TODO: recquires the Ticket and TicketSystem class
    }

    public void closeTicket() {
        //TODO: recquires the Ticket and TicketSystem class
    }

    public void reassignTo(Ticket ticket, Technician technician) {
        //TODO: recquires the Ticket and TicketSystem class
    }

    public List<Ticket> searchCompletedTicket(String keyword) {
        //TODO: recquires the Ticket and TicketSystem class
        //TODO: unit testing (one case)
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Technician that = (Technician) o;
        return Objects.equals(onGoingTickets, that.onGoingTickets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), onGoingTickets);
    }

    @Override
    public String toString() {
        return "Technician{" +
                "onGoingTickets=" + onGoingTickets +
                '}';
    }

    public List<Ticket> getOnGoingTickets() {
        return onGoingTickets;
    }

    public void setOnGoingTickets(List<Ticket> onGoingTickets) {
        this.onGoingTickets = onGoingTickets;
    }
}
