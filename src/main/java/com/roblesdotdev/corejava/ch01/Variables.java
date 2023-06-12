package com.roblesdotdev.corejava.ch01;

// Java is a strongly typed language. Each variable can only hold values of
// a specific type.

public class Variables {

    // You can declare a constant outside a method using static
    public static final int MONTHS_PER_YEAR = 12;

    public static void main(String[] args) {
        // Declaration and initialization
        // type identifier = value;
        int x = 0;
        System.out.printf("The value of x uninitialized is %d\n", x);

        x++;
        System.out.printf("The value of x after update is %d\n", x);

        // Constants: the final kw denotes a value that cannot be changed once
        // it has been assigned.

        final int DAYS_PER_WEEK = 7;

        System.out.println("DAYS: " + DAYS_PER_WEEK);
        System.out.println("MONTHS: " + MONTHS_PER_YEAR);

    }

}
