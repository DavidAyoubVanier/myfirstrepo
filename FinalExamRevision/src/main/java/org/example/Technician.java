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

    public void

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
