package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        Set<Integer> nums2 = new TreeSet<>(); // only allows for 1 of every number and shows them in ascending order
        Set<Integer> nums3 = new HashSet<>();
        Set<Cat> cats = new HashSet<>();

        Cat c1 = new Cat(3, "snow", "female");
        Cat c2 = new Cat(3, "snow", "female");
        Cat c3 = new Cat(4, "lucky", "male");
        Cat c4 = new Cat(1, "mimi", "male");


        cats.add(c1);

        System.out.println(c1.hashCode()); //-1168549429

        for (int i = 9; i >= 0; i--) {
            nums.add(i % 3);
        }

        System.out.println(nums);
    }

    public static Set<Character> findUniqueCharacters(String str) {
        Set<Character> uniqueCharacters = new TreeSet<>();

        for (Character c : str.toCharArray()) {
            uniqueCharacters.add(c);
        }
        return uniqueCharacters;
    }

    public static Map<Character, Integer> countUniqueCharacters(String str) {
        Map<Character, Integer> map = new TreeMap<>();

        for (Character c : str.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        /*
        or:
        for (Character c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, (defaultValue:) 0) + 1);
        }
         */
        return map;
    }
}