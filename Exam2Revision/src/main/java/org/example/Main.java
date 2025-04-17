package org.example;

import java.util.List;

/*

1. false
2. false
3. false
4. true
5. false

1. C
2. D
3. A
4. D, X -> A
5. C

1. Queue is FIFO and Stack is FILO
2. Functional Interface
3. String,
4. O(1)
5.

NOTES:
- Binary Search Trees:
1. Post - Left -> Right -> Root: leaves of the left side (always start on the left)
and go up until you finish everything before the root, then do the same of the right side
2. Pre - Root -> Left -> Right: start with the root then go left until the end, then go back up and get the right ones
until you get to the right side and do the same
3. In: Left -> Root -> Right:


*/
public class Main {
    public static void main(String[] args) {
        User u = new User("mike", User.Gender.MALE);

    }


    public static String reverse(String str) {
    if (str == null || str.length() <= 1) {
        return str;
    }

    return reverse(str.substring(1)) + str.charAt(0);
    }

    public static List<String> process(List<String> strs) {
        double avg = 0;

        for (String str : strs) {
            avg += str.length();
        }
        avg /= strs.size();
        double finalAvg = avg;
        return strs.stream()
                .filter(str -> str.length() <= finalAvg)
                .map(String::toLowerCase)
                .map(str -> str + str)
                .toList();
    }
}