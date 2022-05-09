package org.projects.challenges.reverselettersonly;

/*
9. Reverse only the letters in a string
Write a method in Java that accepts a string as a parameter.
This method should return a string that reverses the letters in the string sent as a parameter but keep all the numbers in order.
For example, if you sent the method a parameter of "ez56d" then it should return "ed56z".
*/
//dze
public class ReverseLettersOnly_Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.execute("ez56d");

        System.out.println(result);
    }
}

class Solution{
    String execute(String word){
        StringBuilder originalWordBuilder = new StringBuilder(word);

        String lettersOnly = word.replaceAll("\\d", ""); //remove all digits [0-9]
        StringBuilder reversedLetters = new StringBuilder(lettersOnly).reverse();

        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isAlphabetic(word.charAt(i))) {
                originalWordBuilder.setCharAt(i, reversedLetters.charAt(count));
                count++;
            }
        }

        return originalWordBuilder.toString();
    }
}
