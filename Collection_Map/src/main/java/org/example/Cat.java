package org.example;

import java.util.Comparator;
import java.util.Objects;

public class Cat {
    private int age;
    private String name;
    private String gender;

    public Cat(int age, String name, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    @Override
    public int compareTo(Cat o) {
        return (this.age - o.age) + 100 * (this.name - o.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(name, cat.name) && Objects.equals(gender, cat.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, gender);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public static class CatComparator implements Comparator<Cat> {
        private String type;
    }

    public CatComparator(String type) {
        this.type = type;
    }

}
