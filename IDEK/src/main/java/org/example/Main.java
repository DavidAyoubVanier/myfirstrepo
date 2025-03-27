package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> nums1 = new Stack<>();

        for (int i = 0; i < 5; i++) {
            nums1.push(i);
        }

        System.out.println(nums1.pop());
        // pop removes the last inputted element e.g. [0,1,2,3,4], using poll would remove 4: [0,1,2,3]
        System.out.println(nums1);


        Queue<Integer> nums = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            nums.add(i);
        }

        System.out.println(nums.poll());
        System.out.println(nums);

        // poll removes the first element in the set i.e. Index [0]
        // peek checks the first element in the set i.e. Index [0]

        Team <FootballPlayer> footballTeam= new Team<>();
        footballTeam.addPlayer(new FootballPlayer);


    }
}




















