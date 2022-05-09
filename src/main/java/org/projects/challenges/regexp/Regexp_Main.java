package org.projects.challenges.regexp;

public class Regexp_Main {
    public static void main(String[] args) {
        String word1 = "abcDEF123ddc123ccc";

        String withoutDigits = word1.replaceAll("\\d", ""); //remove all digits [0-9]
        String withoutLetters = word1.replaceAll("\\D", ""); //remove all NON digits [0-9]


        System.out.println(withoutDigits);
        System.out.println(withoutLetters);


    }
}


