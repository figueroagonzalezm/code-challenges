package org.projects.challenges;

import java.util.Arrays;

public class Temp_Main {
    public static void main(String[] args) {
        String word = "1234";
        revert(word.toCharArray(), 0);

    }

    private static void revert(char[] wordArray, int position) {
        char temp = wordArray[position];
        wordArray[position] = wordArray[wordArray.length - 1 - position];
        wordArray[wordArray.length - 1 - position] = temp;
        System.out.println(Arrays.toString(wordArray));

        if (position * 2 < wordArray.length - 2) {
            revert(wordArray, position + 1);
        } else {
            System.out.println(Arrays.toString(wordArray));
        }
    }
}
