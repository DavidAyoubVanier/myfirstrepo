package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    /**
     * reverses the string
     * @param str
     * @return reversed string
     */
    public static String reverse(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }

        return reverse(str.substring(1)) + str.charAt(0);
    }

    /**
     * counts the average length of a list of strings, removes the strings with more than the average and repeats the rest twice
     * @param strs the original list of strings
     * @return List of processed strings
     */
    public static List<String> process(List<String> strs) {
        double avg = 0;

        for (String str : strs) {
            avg += str.length();
        }
        avg /= strs.size();

        double finalAvg = avg;
        return strs.stream()
                .filter(str -> str.length() < finalAvg)
                .map(String::toLowerCase)
                .map(str -> str + str)
                .toList();
    }

}