package org.example;

public class Main {
    public static void main(String[] args) {

    }

    // TDD = test driven development

    // 0 1 1 2 3 5 8 13 21 34 55
    /*
    5 -> 5
    10 -> 55
    0 -> 0
    1 -> 1
    -5 -> null
    100 -> 354 224 848 179 261 915 075
     */

    public static Long fibonacci(int num) {
        if (num == 1) {
            return 1L;
        }
        if (num < 0) {
            return null;
        }
        Long result = 0L;

        Long f0 = 0L;
        Long f1 = 1L;

        for (int i = 2; i <= num; i++) {
            result = f0 + f1;
            f0 = f1;
            f1 = result;
        }

        return result;
    }
}