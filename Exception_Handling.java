package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    }



    static int divide1(int num1, int num2) {     // we know everything and there are no exceptions
        return num1 / num2;
    }
    /*
    static int divide(int[] nums,  int num) {
        return nums[10] / num;      // there is an issue because num could be 0 -> error
                                    // if the array is {1,2,3,4,5,6,7}, there is no 10th element to divide -> error
    }

    */
    static int divide2(int[] nums,  int num) {
        int result = 0;

        try{
            int element = nums[10];
            result = element / num;
        } catch (ArithmeticException e) {   // will happen first
            System.out.println(e.getClass().getSimpleName() + ": " + e.getMessage());
            StackTraceElement[] stes = e.getStackTrace();
            for(StackTraceElement ste: stes) {
                System.out.println(ste);
            }
        } catch (IndexOutOfBoundsException e) { // will happen second unless the first one solves the problem
            result = nums[0] / num;
        }
        finally {   // optional addition which will happen at the end regardless of what happened before

        }
        return result;
    }

    public static int divide2(int num1, int num2) {
        return num1 / num2;
    }

    public static int mod(int num1, int num2) {
        return num1 % num2;
    }

    public static int calc(int num1, int num2, char oper) {
        try {
            return switch (oper) {
                case '/' -> divide2(num1,num2);
                case '%' -> mod(num1,num2);
                default -> 0;
            }
        }
    }

}