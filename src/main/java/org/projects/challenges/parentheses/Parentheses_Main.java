package org.projects.challenges.parentheses;

/*
returns true if the parentheses matches in the word otherwise returns false
*/
public class Parentheses_Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String word1 = "(kjksvds)";
        String word2 = "<kjksvds>";
        String word3 = "[kjksvds]de";
        String word4 = "kjksvds";
        String word5 = "[kjksvds>";

        System.out.println(word1+" : "+ solution.execute(word1));
        System.out.println(word2+" : "+ solution.execute(word2));
        System.out.println(word3+" : "+ solution.execute(word3));
        System.out.println(word4+" : "+ solution.execute(word4));
        System.out.println(word5+" : "+ solution.execute(word5));

    }
}
class Solution{
    boolean execute(String word){
        String openers = "<([";
        String closers = ">)]";
        boolean result = false;
        for (int i = 0; i < openers.length(); i++) {
            if(word.indexOf(openers.charAt(i)) >= 0 ){
                if(word.indexOf(closers.charAt(i)) >= 0 ){
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
}