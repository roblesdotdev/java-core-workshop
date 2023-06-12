package com.roblesdotdev.corejava.ch01;

// System.out  -> Standard output
// System.in   -> Standard input

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        System.out.println("What is your name?");
        // read the line from input
        String name = in.nextLine();
        // to read a single word use in.next()

        System.out.println("How old are you?");
        int age = in.nextInt();

        System.out.printf("Welcome %s %d\n", name, age);
    }
}
