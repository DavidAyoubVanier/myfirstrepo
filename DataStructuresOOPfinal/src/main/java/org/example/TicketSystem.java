package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.*;

public class TicketSystem {
    public static final String OPENED_TICKETS_FILE_PATH = "src/main/resources/openedTickets.csv";
    public static final String COMPLETED_TICKETS_FILE_PATH = "src/main/resources/completedTickets.csv";

    public static Queue<Ticket> openedTickets = initTickets(OPENED_TICKETS_FILE_PATH);
    public static List<Ticket> completedTickets = initTickets(COMPLETED_TICKETS_FILE_PATH);

    /**
     * reads tickets from an external file
     * @param path
     * @return returns the list of completed and opened tickets
     */
    public static LinkedList<Ticket> initTickets(String path) {
        LinkedList<Ticket> tickets = new LinkedList<>();

        File file = new File(path);
        int nextId;
        try (Scanner scanner = new Scanner(file)) {
            while(scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0]);
                String title = parts[1];
                String detail = parts[2];
                String creator = parts[3];
                LocalDateTime date = LocalDateTime.parse(parts[4]);
                Ticket.Status status = Ticket.Status.valueOf(parts[5]);
                String technician = parts[6];

                Ticket ticket = new Ticket(id, title, detail, creator, date, status, technician);
                tickets.add(ticket);
                if (path.equals(OPENED_TICKETS_FILE_PATH)) {
                    nextId = id + 1;
                    Ticket.setNextId(nextId);
                }
            }
        } catch (FileNotFoundException ignored) {
        }

        return tickets;
    }

    public static void export() {
        writeTicketsToFile(OPENED_TICKETS_FILE_PATH, openedTickets);
        writeTicketsToFile(COMPLETED_TICKETS_FILE_PATH, completedTickets);
    }

    public static void writeTicketsToFile(String path, Collection<Ticket> tickets) {
        File file = new File(path);

        try (FileWriter fw = new FileWriter(file)) {
            for (Ticket ticket : tickets) {
                fw.write(ticket.getId() + ",");
                fw.write(ticket.getTitle() + ",");
                fw.write(ticket.getDetail() + ",");
                fw.write(ticket.getCreator() + ",");
                fw.write(ticket.getCreatedTime() + ",");
                fw.write(ticket.getStatus() + ",");
                fw.write(ticket.getTechnician() + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
