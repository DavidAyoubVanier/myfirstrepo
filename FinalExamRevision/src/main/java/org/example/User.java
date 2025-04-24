package org.example;

import java.util.Comparator;
import java.util.Objects;

public class User implements Comparable<User> {
    private int id;
    private String name;
    private Gender gender;

    public enum Gender {
        FEMALE, MALE
    }

    private static int nextId = 1;

    public User(String name, Gender gender) {
        this.id = nextId++;
        this.name = name;
        this.gender = gender;
    }

    public void createTicket(String title, String context) {
        //TODO
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(name, user.name) && Objects.equals(gender, user.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, gender);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        User.nextId = nextId;
    }
    @Override
    public int compareTo(User o) {
        return this.id - o.id;
    }
}
