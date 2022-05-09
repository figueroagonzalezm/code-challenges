package org.projects.challenges.ricebags;

public class RiceBags_Main {

    public static void main(String[] args) {
        int small = 30;
        int big = 2;
        int goal = 32;

        Solution solution = new Solution();
        int result = solution.execute(small, big, goal);
        System.out.println(result);
    }
}

class Solution {
    int execute(int small, int big, int goal) {
        int smallNeeded;
        int bigKilos = big * 5;
        int bigRequired = goal / 5;
        if (bigKilos + small < goal) {
            smallNeeded = -1;
        } else {
            if (bigKilos - goal > 1) {
                smallNeeded = goal - bigRequired * 5;
            } else {
                smallNeeded = goal - bigKilos;
            }
        }
        return smallNeeded;
    }
}
