package org.projects.learning.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList_Main {
    public static void main(String[] args) {
        /* Insert an element into a specific position of a LinkedList is LESS expensive than inserting into a list */

        long timeStartLinkedList = System.currentTimeMillis();

        LinkedList<String> names = new LinkedList<>(List.of("Miguel", "Pedro", "Juana", "Tomas"));

        for (int i = 0; i < 500_000; i++) {
            names.add(3, "name"+i);

        }
        long timeEndLinkedList = System.currentTimeMillis();
        System.out.println("Time elapsed by linkedList: "+ (timeEndLinkedList - timeStartLinkedList) / 1000);

        long timeStartArrayList = System.currentTimeMillis();
        ArrayList<String> list = new ArrayList<>(List.of("Miguel", "Pedro", "Juana", "Tomas"));
        for (int i = 0; i < 500_000; i++) {
            list.add(3, "name"+i);
            //System.out.println(i);
        }
        long timeEndArrayList = System.currentTimeMillis();
        System.out.println("Time elapsed by arrayList: "+ (timeEndArrayList - timeStartArrayList) / 1000);

    }
}
