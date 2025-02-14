package org.example;

public class Main {
    public static void main(String[] args) {

    }

    public static double sum(double[] nums) {
        double sum = 0;
        for (double num : nums) {
            sum += num;
        }
        return sum;
    }

    public static double avg(double[] nums) {
        if(nums.length == 0) return 0;
         return sum(nums) / nums.length;
    }

    public static double min(double[] nums) {
        if(nums.length == 0) return -1;
        double min = nums[0];
        for (double num : nums) {
            if(num < min) {
                min = num;
            }
        }
        return min;
    }

}