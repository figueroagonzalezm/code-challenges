package org.projects.challenges.anagrams;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
Write a function in your favorite programming language that will accept any two strings as parameters
and return “1” if they are anagrams and “0” if they are not.

Anagram examples:
"coronavirus" = "carnivorous"
"a gentleman" = "elegant man"
"funeral" = "real fun"
*/

public class Anagrams_Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String result  = solution.execute("a gentleman", "elegant man");
        System.out.println(result);
    }

}

class Solution{
    String execute (String a, String b){

        a = a.replaceAll(" ", "");
        b = b.replaceAll(" ", "");


        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();


        Arrays.sort(aArray);
        Arrays.sort(bArray);

        String aResult = Arrays.toString(aArray);
        String bResult = Arrays.toString(bArray);
        if(aResult.equals(bResult))
            return "1";
        else
            return "0";
    }
}