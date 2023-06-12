package com.roblesdotdev.corejava.ch01;

// Addition, subtraction, multiplication and division are denoted by: + - * /

// The operator % yields the remainder.

// Increment and decrement operators: ++ --

public class BasicArithmetic {

    public static void main(String[] args) {
        float total = 0;
        float amount = 233;
        float discount = 0.2F;

        total = amount - (amount * discount);

        System.out.printf("The total is %.2f\n", total);

    }
}
