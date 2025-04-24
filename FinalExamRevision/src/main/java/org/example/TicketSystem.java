package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class TicketSystem {
    public static final String OPENED_TICKETS_FILE_PATH = "src/main/resources/openedTickets.csv";
    public static final String COMPLETED_TICKETS_FILE_PATH = "src/main/resources/completedTickets.csv";

    public static Queue<Ticket> openedTickets = initTickets(OPENED_TICKETS_FILE_PATH);
    public static List<Ticket> completedTickets = initTickets(COMPLETED_TICKETS_FILE_PATH);

    public void openedTickets() {

    }

    public void completedTicket() {

    }

    public static LinkedList<Ticket> initTickets(String path) {
        LinkedList<Ticket> tickets = new LinkedList<>();

        File file = new File(path);
        int nextId;
        try (Scanner scanner = new Scanner(file)) {
            while(scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0]);

                if (path.equals(OPENED_TICKETS_FILE_PATH)) {
                    nextId = id + 1;
                    Ticket.setNextId(nextId);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return tickets;
    }

    public static void export() {

    }
}
