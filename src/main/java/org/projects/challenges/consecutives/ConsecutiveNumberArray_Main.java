package org.projects.challenges.consecutives;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
    7. Write a method to determine consecutive numbers
    Create a method in a Java class that accepts an array of numbers as a parameter.
    If the array of numbers can be rearranged so that they’re consecutive numbers where no number appears twice, return true.
    If this isn’t possible, return false. The array can be of any size.
*/

public class ConsecutiveNumberArray_Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        boolean result = solution.execute(new int[]{2, 1, 3, 4, 5, 6, 7, 8, 9, 10, 11});
        System.out.println(result);
    }
}

class Solution {
    public boolean execute(int[] numbers){
        List<Integer> listInt = Arrays.stream(numbers).boxed().sorted().collect(Collectors.toList());
        Set<Integer> setInt = new HashSet<>(listInt);

        int firstValue = listInt.get(0);
        if(listInt.size() != setInt.size()){
            return false;
        }else{
            int b = 0;
            for (int i = firstValue; i < listInt.size(); i++) {
                if(listInt.get(b) != i) {
                    return false;
                }
                b++;
            }
            return true;
        }
    }
}
