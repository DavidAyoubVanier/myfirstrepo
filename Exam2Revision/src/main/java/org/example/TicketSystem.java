package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class TicketSystem {
    private static final String OPENED_TICKETS_PATH = "src/main/resources/openedTickets.csv";
    private static final String COMPLETED_TICKETS_PATH = "src/main/resources/completedTickets.csv";

    public static Queue<Ticket> openedTickets = initTickets(OPENED_TICKETS_PATH);
    public static List<Ticket> completedTickets = initTickets(COMPLETED_TICKETS_PATH);

    public static LinkedList<Ticket> initTickets(String path) {
        File file = new File(path);

        LinkedList<Ticket> tickets = new LinkedList<>();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0]);
                String title = parts[1];
                String detail = parts[2];
                String creator = parts[3];
                LocalDateTime createdTime = LocalDateTime.parse(parts[4]);
                Ticket.Status status = Ticket.Status.valueOf(parts[5]);
                String technician = parts[6];
                Ticket ticket = new Ticket(id, title, detail, creator, createdTime, status, technician);
                tickets.add(ticket);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return tickets;
    }
}
