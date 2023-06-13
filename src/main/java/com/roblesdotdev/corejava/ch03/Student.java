package com.roblesdotdev.corejava.ch03;

// Every java class extends of class Object.

// public class Employee {}
// ==
// public class Employee extends Object {}

// Object define methods: toString, equals, hashCode, clone, finalize

public class Student extends Person {
    private final int id;

    public Student(String name, int id) {
        super(name);
        this.id = id;
    }
    @Override
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return super.toString() + "<Person>";
    }

}
