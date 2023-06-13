package com.roblesdotdev.corejava.ch03;

// Abstract classes
//  can define methods without implementation, forcing subclasses to implement it.

// cannot instance abstract classes
public abstract  class Person {
    private final String name;

    public Person(String name) { this.name = name; }
    public final String getName() { return name; }
    public abstract int getId();

}
