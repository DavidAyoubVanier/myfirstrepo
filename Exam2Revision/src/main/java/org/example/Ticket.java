package org.example;

import java.time.LocalDateTime;
import java.util.Objects;

public class Ticket {
    private int id;
    private String title;
    private String detail;
    private String creator;
    private LocalDateTime createdTime;
    private Status status;
    private String technician;

    private static int nextId = 1;

    public Ticket(String detail, String creator, String title) {
        this.id = nextId++;
        this.detail = detail;
        this.creator = creator;
        this.title = title;
        this.createdTime = LocalDateTime.now();
        this.status = Status.OPEN;
        this.technician = null;
    }

    public Ticket(int id, String title, String detail, String creator, LocalDateTime createdTime, Status status, String technician) {
        this.id = id;
        this.title = title;
        this.detail = detail;
        this.creator = creator;
        this.createdTime = createdTime;
        this.status = status;
        this.technician = technician;
    }

    public enum Status {
        OPEN, PROCESSING, CLOSED
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return id == ticket.id && Objects.equals(title, ticket.title) && Objects.equals(detail, ticket.detail) && Objects.equals(creator, ticket.creator) && Objects.equals(createdTime, ticket.createdTime) && status == ticket.status && Objects.equals(technician, ticket.technician);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, detail, creator, createdTime, status, technician);
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", detail='" + detail + '\'' +
                ", creator='" + creator + '\'' +
                ", createdTime=" + createdTime +
                ", status=" + status +
                ", technician='" + technician + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getTechnician() {
        return technician;
    }

    public void setTechnician(String technician) {
        this.technician = technician;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Ticket.nextId = nextId;
    }
}
