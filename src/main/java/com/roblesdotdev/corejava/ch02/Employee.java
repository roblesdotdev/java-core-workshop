package com.roblesdotdev.corejava.ch02;

// private: only methods of the same class can access them.

public class Employee {
    private static int lastId = 0;
    private final String name;
    private double salary;
    private final int id;

    public Employee(String name, double salary) {
        lastId++;
        id = lastId;
        this.name = name;
        this.salary = salary;
    }

    // final methods cannot override
    public final String getName() {
        return name;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 2;
        salary += raise;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }
}
