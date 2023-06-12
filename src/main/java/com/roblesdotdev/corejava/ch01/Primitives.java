package com.roblesdotdev.corejava.ch01;

// Even though Java is an object-oriented programming language,
// not all Java values are objects. Instead, some values belong to primitive types.

// Signed Integers
// byte      1 byte     -128 to 127
// short     2 bytes
// int       4 bytes
// long      8 bytes

// Floating Point
// float     4 bytes
// double    8 bytes

// The char type describes "code units" in the UTF-16 character encoding
// char   '\u004A' == 'J'

// The boolean type has two values: true and false.

public class Primitives {
    public static void main(String[] args) {
        System.out.println("The min value of byte is " + Byte.MIN_VALUE);
        System.out.println("The max value of byte is " + Byte.MAX_VALUE);
        System.out.println("The min value of int is " + Integer.MIN_VALUE);
        System.out.println("The max value of int is " + Integer.MAX_VALUE);
    }
}
