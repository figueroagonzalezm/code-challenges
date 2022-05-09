package org.projects.challenges.longestsubsequence;

//Given two strings, write a method that finds the longest common sub-sequence.

public class FindLongestSubsequence_Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String value1 = "adsss concatenacion cded";
        String value2 = "asss concatenacion";
        String result = solution.execute(value1, value2);
        System.out.println("result: "+ result);
    }
}
class Solution{
    String execute(String s1, String s2){
        String result = "";
        for (int length = s1.length(); length > 0; length--) {
            int startIndex = 0;
            System.out.println("-----------------------------------");
            while(startIndex + length <= s1.length()){
                String current = s1.substring(startIndex, startIndex + length);
                System.out.println(current);
                startIndex++;
                if(s2.contains(current)){
                    System.out.println("..............encontrado.................");
                    result = current;
                    break;
                }
            }
            if(! result.isEmpty()){
                break;
            }
        }
        return result;
    }

}
