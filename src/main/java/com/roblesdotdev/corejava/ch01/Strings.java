package com.roblesdotdev.corejava.ch01;

// A String is a sequence of characters. Can contain any unicode character.

// Common methods
// bool startsWith(String str)
// bool endsWith(String str)
// bool contains(String str)

// int indexOf(String str)
// int lastIndexOf(String str)

// String replace(CharSequence oldString, CharSequence newString)

// String toUpperCase()
// String toLowerCase()

// Note: the String class is immutable, that is, none of String methods modify
// the string on which they operate.

// name.toUpperCase()   ->    return a new string without changing name

public class Strings {
    public static void main(String[] args) {

        String firstname = "John";
        String lastname = "Doe";

        // Concatenation
        String fullname = firstname + " " + lastname;

        System.out.println("Welcome " + fullname);

        // Substrings
        String location = fullname.substring(5, 8);
        System.out.println(location);

        // Splitting
        String names = "Peter, Paul, Mary";
        String[] result = names.split(", ");
        for (String n : result) {
            System.out.println(n);
        }

        // Comparation
        // Not use == with strings (== is the same object?)
        String n1 = "John";
        String n2 = "John";

        System.out.println(n1.equals(n2));

        // String can be null
        String notInitialized = null;

        // null != ""  -> "" is a string of length 0

        System.out.printf("string is null? %b\n", notInitialized == null);

        String test = "foo";

        System.out.println(test.toUpperCase());

        System.out.println(test);

    }
}
