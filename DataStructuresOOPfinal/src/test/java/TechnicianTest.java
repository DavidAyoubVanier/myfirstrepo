import org.example.Technician;
import org.example.Ticket;
import org.example.TicketSystem;
import org.example.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TechnicianTest {
    @Test
    public void testSearchCompletedTicket() {
        Ticket t1 = new Ticket("hello", "", null);
        Ticket t2 = new Ticket("HELLO", "", null);
        Ticket t3 = new Ticket("hEllO", "", null);
        Ticket t4 = new Ticket("yes hello", "", null);
        Ticket t5 = new Ticket("hel lo", "", null);
        Ticket t6 = new Ticket("", "", null);
        Ticket t7 = new Ticket("jello hello", "", null);

        TicketSystem.completedTickets = List.of(t1, t2, t3, t4, t5, t6, t7);

        Technician technician = new Technician("", User.Gender.MALE);
        List<Ticket> expected = List.of(t1, t2, t3, t4, t7);
        List<Ticket> result = technician.searchCompletedTicket("hello");

        Assertions.assertEquals(expected, result);
    }
}
