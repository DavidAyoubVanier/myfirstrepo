package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums1 = new ArrayList<>();
        List<Integer> nums2 = new ArrayList<>();
        List<Integer> nums = new ArrayList<>();

        for (int i = 0 ; i < 10 ; i++) {
            nums2.add(i);
        }

        // {0,1,2,3,4,5,6,7,8,9}
        ListIterator<Integer> iterator = nums.listIterator();

        while (iterator.hasNext()) {
            int num = iterator.next();
            if (num % 2 == 0) {
                iterator.set(999);
            }
        }

        while (iterator.hasPrevious()) {
            int num = iterator.previous();
            System.out.println(num);
        }

        // m(nums2);
    }




    /*
    public static void m(List<Integer> nums) {
        for (Integer num1 : nums) {
            for (Integer nums2 : nums) {
                System.out.println(nums);
            }
        }
        for (Integer nums2 : nums) {

        }

    }
    */
}