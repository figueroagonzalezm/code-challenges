package org.projects.challenges;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Temp2_Main {
    public static void main(String[] args) {
//        String valueToAvoid = "z";
//        List<String> list = new ArrayList<>(Arrays.asList("hello", "howz", "are", "youz"));
//
//        list.stream()
//                .filter(str->!str.contains(valueToAvoid))
//                .collect(Collectors.toList())
//                .forEach(System.out::println);
//        list.forEach(System.out::println);
//        List<Integer> numbers = List.of(10, 9, 8, 7, 6, 5, 4, 3, 2,3, 1);
//        numbers.stream().sorted()
//                .distinct()
//                .forEach(System.out::println);


        String word =  "abcba";


        String vowels = "aeiou";
        int vowelsCount = 0;
        int consonantsCount = 0;
        for (int i = 0; i < word.length(); i++) {
            if(vowels.contains(word.charAt(i)+"")){
                vowelsCount++;
            }else{
                consonantsCount++;
            }
        }
        System.out.println("consonantes: "+ consonantsCount +" vocales: "+ vowelsCount);

        word.chars()
                .boxed()
                .collect(Collectors.toList());

//        boolean result = IntStream.range(0, word.length() / 2)
//                .allMatch(i-> {
//                    System.out.println("valor i: "+i);
//                    return word.charAt(i) == word.charAt(word.length() - i - 1);
//                });









    }
}
