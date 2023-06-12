package com.roblesdotdev.corejava.ch01;

// Array: item collection of the same type
// You need know its length.
// String[]  int[]   char[]

// ArrayList is the builtin class for work with arrays
// Handle arrays internally(length).
// ArrayList<int>  -> Is illegal. Should use a "wrapper class" for the primitive types.
// Integer, Byte, Short, Long, Character, Float, Double, Boolean
// ArrayList<String>  ArrayList<Integer>

import java.util.ArrayList;

public class ArraysAndLists {
    public static void main(String[] args) {

        // Create an array with size 5
        String[] names = new String[5];

        // Populate
        for (int i = 0; i < names.length; i++) {
            names[i] = String.format("Name number %d", i);
        }

        // Iterate
        for (String name : names) {
            System.out.println(name);
        }

        // Declare and initialize
        String[] authors = {
                "Bob",
                "James",
                "Sara"
        };

        for (String author : authors) {
            System.out.println(author);
        }

        // Array Lists
        //
        ArrayList<String> friends = new ArrayList<>();  // <> infers

        friends.add("Peter");
        friends.add("Paul");
        friends.add("Sam");

        for (String friend : friends) {
            System.out.println("Friend -> " + friend);
        }


    }
}
