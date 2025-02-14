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
        if (nums.length == 0) return -1;
        double min = nums[0];
        for (double num : nums) {
            if(num < min) {
                min = num;
            }
        }
        return min;
    }

    public static double calcFinalScore(double[] scores) {
        double min = scores[0];
        double max = scores[0];
        double sum = 0;
        for (double score : scores) {
            sum += score;
            if (score < min) {
                min = score;
            } else if (score > max) {
                max = score;
            }
        }
        sum -= max;
        sum -= min;
        double scoresLeft = scores.length - 2;
        return sum / scoresLeft;
    }

    public static double[] minOfRow(double[][] numss) {

    }

    public static double[] minOfCol(double[][] numss) {

    }
}