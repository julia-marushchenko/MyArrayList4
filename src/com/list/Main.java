// Java program to demonstrate ArrayList<>

package com.list;

import java.util.ArrayList;
import java.util.List;

// Main class
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Creating ArrayList<>
        List<Float> list = new ArrayList<>();

        // Adding elements to the list
        list.add(11f);
        list.add(12f);
        list.add(2.1f);
        list.add(3.7f);

        // Printing the list to console
        System.out.println(list);

        // Checking if there is an element 12f
        System.out.println("Is there element 12f: " + list.contains(12f));

        // Checking if there is an element 2.1f
        System.out.println("Is there element 12f: " + list.contains(2.1f));

        // Checking if there is an element 12.0
        System.out.println("Is there element 12.0: " + list.contains(12.0));

        // Removing all elements from the list
        list.clear();

        // Checking if the list is empty
        System.out.println("Is the list empty: " + list.isEmpty());
    }
}