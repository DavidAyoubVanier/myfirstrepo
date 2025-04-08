package org.example;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Cat c1 = new Cat("snow", 4);
        Cat c2 = new Cat("angel", 2);
        Cat c3 = new Cat("lucky", 6);
        Cat c4 = new Cat("mimi", 1);

        List<Cat> cats = new ArrayList<>();
        cats.add(c1);
        cats.add(c2);
        cats.add(c3);
        cats.add(c4);

        cats.stream()
                .filter(cat -> cat.getAge() > 3)
       //         .forEach(cat -> System.out.println(cat));
                .forEach(System.out::println); // method reference


        // In this segment, the stream() is mandatory because you apply a filter as well (make a chain)
        cats.stream()
                .filter(cat -> cat.getAge() > 3)
                .forEach(cat -> System.out.println(cat));

        // In this segment, the stream() is optional because the forEach() is able to act on a normal List without stream()
        cats.stream().forEach(cat -> cat.increaseAge());
        cats.stream().forEach(cat -> cat.toUppercase());
        cats.stream().forEach(cat -> System.out.println(cat));

        // Better way to write this code:
        cats.forEach(Cat::increaseAge);
        cats.forEach(Cat::toUppercase);
        cats.forEach(System.out::println);

        // Collections.sort(cats, new Cat.CatComparator()); This requires the functional interface of the comparator
        Collections.sort(cats, (cat1, cat2) -> (cat1.getName().compareTo(cat2.getName())));
        Collections.sort(cats, (cat1, cat2) -> {
            System.out.println("hahaha");
            int num = 0;
            if (cat1.getName().startsWith("A")) {
                num++;
            } else {
                num--;
            }
            return num;
        });

        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            nums.add(i*5);
        }

        // stream.filter ->
        // remove some elements, and only keep the elements that satisfy a condition
        List<Integer> nums2 = nums.stream()
                .filter(num -> num % 2 == 0)
                .filter(num -> num > 40)
                .toList();

        long count = nums.stream()
                .filter(num -> num % 2 == 0)
                .count();

        // stream.map ->
        // maps each element into new element
        List<Integer> nums3 = nums.stream()
                .map(num -> num / 5)
                .toList();

        for (int num: nums) {
            if (num % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
        }

    /**
     * remove all strings that do not contain any vowels,
     * and removes all strings with length of one,
     * and bring everything to lowercase
     * {"HI", "how", "Are", "U", "123"} -> {"hi", "how", "are", }
     * @param strs
     */
    public static List<String> process(List<String> strs) {
        List<String> processed = strs.stream()
                .map(String::toLowerCase)  // original, reduntant: .map(str -> str.toLowerCase())
                .filter(str -> str.contains("a") || str.contains("e") || str.contains("i") || str.contains("o") || str.contains("u"))
                .filter(str -> str.length() > 1)
                .toList();
        return processed;
    }

    // TDD
    public static long fibonacci(int num) {
        if (num < 0) {
            throw new InvalidParameterException();
        }

        if (num == 1) {
            return 1;
        }

        long result = 0;
        long f0 = 0;
        long f1 = 1;

       /*
        for (int i = 2, i <= num; i++) {
            result = f0 + f1;

        }
        */
    }
}