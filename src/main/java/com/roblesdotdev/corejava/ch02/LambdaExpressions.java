package com.roblesdotdev.corejava.ch02;

// Lambda expression is a block of code that you can pass around so it can be executed later,
// once or multiple times.

// () -> { do stuff... }
// oneArg -> { do stuff... }
// (String str1, String str2) -> { do stuff... }


import java.util.Arrays;

public class LambdaExpressions {
    public static void main(String[] args) {

        String[] names = new String[] {
                "John Doe",
                "Mary Jane",
                "Sam",
                "Adam",
        };

        Arrays.sort(names, (first, second) -> first.length() - second.length());
        // Or use method reference
        // Arrays.sort(names, Comparator.comparingInt(String::length));

        Arrays.stream(names).toList().forEach(System.out::println);
    }
}
