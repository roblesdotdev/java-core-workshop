package com.roblesdotdev.corejava.ch01;

// This is my first java program and this is a comment.

// A package is a set of related classes. It is a good idea to place each
// class in a package, so you can group related classes together and avoid
// conflicts when multiple classes have tha same name.

public class FirstProgram {
    // main is a method, that is, a function declared inside a class.
    // The main method is the first method that that is called when the
    // program runs.
    public static void main(String[] args) {

        // System.out representing the "standard output" of the java program.
        System.out.println("Hello, World");

        // The string class have the length method that returns the length of a
        // String object. Use the dot notation to call a method.
        System.out.println("Hello, World".length());
    }
}
