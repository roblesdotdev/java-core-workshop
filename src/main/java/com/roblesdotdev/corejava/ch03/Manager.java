package com.roblesdotdev.corejava.ch03;

import com.roblesdotdev.corejava.ch02.Employee;

// extends kw indicates that you make a new class that derivative from existing class.

// final class cannot extend
public final class Manager extends Employee  {
    private final double bonus;
    public Manager(String name, double salary, double bonus) {
        // call to the constructor of Employee class
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }

}
