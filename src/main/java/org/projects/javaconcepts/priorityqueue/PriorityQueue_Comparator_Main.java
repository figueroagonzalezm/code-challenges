package org.projects.javaconcepts.priorityqueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueue_Comparator_Main {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new
                PriorityQueue<String>(new The_Comparator());

        queue.add("G");
        queue.add("E");
        queue.add("E");
        queue.add("K");
        queue.add("S");
        queue.add("4");

        System.out.println("The elements with the highest priority element at front of queue:");
        while (!queue.isEmpty()) {
            System.out.println(" " + queue.poll());
        }
    }
}

class The_Comparator implements Comparator<String> {
    public int compare(String str1, String str2) {
//        return str2.compareTo(str1); //todo: enabling this line (and commenting the next one) inverts the queue order
        return str1.compareTo(str2);
    }
}