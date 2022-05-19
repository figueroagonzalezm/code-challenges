package org.projects.challenges.anagrams;

import java.util.*;

public class InArrayAnagrams_Main {

    public static void main(String[] args) {

        Map<String, Set<String>> prepareDataMap = new TreeMap<>();
        Map<String, Set<String>> outputMap = new TreeMap<>();
        Set<Set<String>> outputSet = new HashSet<>();

        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};

        for (String word1 : input) {
            prepareDataMap.put(word1, new TreeSet<>(Collections.singletonList(word1)));
            for (String word2 : input) {
                if (wordMatches(word1, word2)) {
                    prepareDataMap.get(word1).add(word2);
                }
            }
        }

        for (Map.Entry<String, Set<String>> entry : prepareDataMap.entrySet()) {
            outputMap.put(entry.getValue().toString(), entry.getValue());
        }
        for (Map.Entry<String, Set<String>> entry : outputMap.entrySet()) {
            outputSet.add(entry.getValue());
        }

        System.out.println(outputSet);
    }

    private static boolean wordMatches(String word1, String word2) {
        if (!word1.equals(word2)) {
            int matchCount = 0;
            for (int k = 0; k < word1.length(); k++) {
                if (word2.contains(String.valueOf(word1.charAt(k)))) {
                    matchCount++;
                }
            }
            return matchCount == word1.length();
        }
        return false;
    }

//Siarhei Yerashevich <Siarhei_Yerashevich@epam.com>
}

