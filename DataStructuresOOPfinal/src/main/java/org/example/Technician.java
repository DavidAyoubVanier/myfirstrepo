package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Technician extends User{
    private List<Ticket> onGoingTickets;
    public Technician(String name, User.Gender gender) {
        super(name, gender);
        this.onGoingTickets = new ArrayList<>();
    }

    /**
     * gets a new ticket from the opened tickets in the tickets system
     * update its status and technician, then send it to the technician's onGoingTickets list
     */
    public void fetchNewTicket() {
        Ticket ticket = TicketSystem.openedTickets.poll();
        ticket.setTechnician(this.getName());
        ticket.setStatus(Ticket.Status.PROCESSING);
        onGoingTickets.add(ticket);

        TicketSystem.export();
    }

    /**
     * close a ticket, remove it from the technician's onGoingTickets list
     * add the ticket to the completedTickets list
     * export the ticket to a file
     * @param ticket the ticket to close
     */
    public void closeTicket(Ticket ticket) {
        ticket.setStatus(Ticket.Status.CLOSED);
        onGoingTickets.remove(ticket);
        TicketSystem.completedTickets.add(ticket);

        TicketSystem.export();
    }

    /**
     * reassign a ticket to another technician
     * @param ticket the ticket to reassign
     * @param technician the new technician to reassign the ticket to
     */
    public void reassignTo(Ticket ticket, Technician technician) {
        ticket.setTechnician(technician.getName());
        onGoingTickets.remove(ticket);
        technician.onGoingTickets.add(ticket);
    }

    /**
     * search through the completedTickets list for tickets that contain the keyword in their titles
     * @param keyword the keyword to search for
     * @return a list of completed tickets that contain the keyword in their titles
     */
    public List<Ticket> searchCompletedTicket(String keyword) {
        return TicketSystem.completedTickets.stream()
                .filter(ticket -> ticket.getTitle().toLowerCase().contains(keyword.toLowerCase()))
                .toList();
    }

    @Override
    public boolean equals(Object o) {
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
                '}' + super.toString();
    }

    public List<Ticket> getOnGoingTickets() {
        return onGoingTickets;
    }

    public void setOnGoingTickets(List<Ticket> onGoingTickets) {
        this.onGoingTickets = onGoingTickets;
    }
}