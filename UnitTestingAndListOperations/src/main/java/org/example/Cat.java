package org.example;

import java.util.Comparator;
import java.util.Objects;

public class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void increaseAge() {
        age++;
    }

    public void toUppercase() {
        name = name.toUpperCase();
    }

    public Cat() {
        this.name = "Unknown";
        this.age = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    /*

    public static class CatComparator implements Comparator<Cat> {

        @Override
        public int compare(Cat o1, Cat o2) {
            return o1.name.compareTo(o2.name);
        }
    }

     */
}