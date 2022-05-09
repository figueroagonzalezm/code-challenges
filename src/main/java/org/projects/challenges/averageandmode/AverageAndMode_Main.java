package org.projects.challenges.averageandmode;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
You’re training for a marathon and have a list of times in which you’ve completed your training runs.
Write a function, averageFinder that will return the average and mode of your race times.

*/
public class AverageAndMode_Main {
    public static void main(String[] args) {

        int[] values = {100, 120, 150, 120, 130, 120, 130};

        List<Integer> listInt = Arrays.stream(values).boxed().collect(Collectors.toList());

        double average = listInt.stream()
                .mapToInt(value -> value)
                .average().getAsDouble();

        Map<Integer, Long> groupedValues = listInt.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map.Entry<Integer,Long> maxEntry = null;
        for (Map.Entry<Integer,Long> entry : groupedValues.entrySet()) {
            if(maxEntry==null || maxEntry.getValue() < entry.getValue())
                maxEntry = entry;
        }

        System.out.println("Average: "+ average);
        System.out.println("Mode: "+ maxEntry.getKey());
    }
}

