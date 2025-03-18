package org.example;

public class Main {
    public static void main(String[] args) {


    }

    /**
     * print numbers in range [1, num]
     * @param num the upper bound (assume it is always positive)
     */
    public static void printNum(int num) {
        // base case
        if (num == 0) {
            return;
        }

        // general pattern
        System.out.println(num);
        printNum(num - 1);
    }
    // this version outputs in descending order: e.g. 3, 2, 1
    // recursion means first call -> last finish

    /*
    public static void printNum(int num) {
        // base case
        if (num == 0) {
            return;
        }

        // general pattern
        printNum(num - 1);
        System.out.println(num);
    }
    // this version outputs in ascending order: e.g. 1, 2, 3
     */

    /**
     * calculate the sum of values in range [1, num]
     * @param num the upper bound (assume it is always positive)
     */
    public static int sum(int num) {
        if (num == 1) {
            return 1;
        }

        return sum(num - 1) + num;
    }

    /**
     * calculate the fibonacci number with the certain input
     * @param num
     * @return
     * F(0) = 0
     * F(1) = 1
     * F(2)= 1
     * F(3) = 2
     * F(4) = 3
     * 0 1 1 2 3 5 8 13 21 34 55
     */
    public static int fibonacci(int num) {
        if (num <= 1) {
            return num;
        }
        
    }
}