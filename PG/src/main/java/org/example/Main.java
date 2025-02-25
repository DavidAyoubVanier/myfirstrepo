package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


    }

    public static double sum(double[] nums) {
        if(nums== null) {
            return 0;
        }

        double sum = 0;

        for(double num : nums) {
            sum += num;
        }
        return sum;
    }

    public static double avg(double[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        }
        return sum(nums) / nums.length;
    }

    public static double min(double[] nums) {
        if (nums == null || nums.length == 0) {
            return Double.NaN;
        }

        double min = Double.MAX_VALUE;      // nums[0]

        for (double num : nums) {
            if (num < min) {
                min = num;
            }
            min = Math.min(num, min);
        }

        return min;
    }

    public static double[] calaRowMin(double[][] numss) {
        if (numss == null) {
            return null;
        }
        double[] mins = new double [numss.length];
        Arrays.fill(mins,Double.MAX_VALUE);

        for(int i = 0; i < numss.length; i++) {
            mins[i] = min(numss[i]);
        }
        return mins;
    }

    public static double[] calaColMin(double[][] numss) {
        int col = 0;
    }
}