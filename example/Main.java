package org.example;

/*
1. F
2. F
3. F
4. T
5. T

1. B
2. C -> false, D
3. B -> false, C
4. B
5. C

1. extend
2. default
3. comparator
4. ArrayList<Long> nums = new Arraylist<>
5. FileWriter
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


    }

    public static void multiply(double nums[], double factor) {
        if (nums == null) {
            return;
        }
        for(int i = 0; i < nums.length; i++) {
            nums[i] *= factor;
        }
    }

    /**
     * counts the amount of negative numbers values in the arraylist
     * @param nums the arraylist we input
     * @return the number of negative values
     */
    public static int countNegative(ArrayList<Integer> nums) {
        if ( nums == null) {
            return 0;
        }

        int counter = 0;

        for (Integer num : nums) {
            if (num != null && num < 0) {
                counter++;
            }
        }

        return counter;
    }
}