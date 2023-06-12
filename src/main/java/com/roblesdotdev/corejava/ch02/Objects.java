package com.roblesdotdev.corejava.ch02;

public class Objects {

    public static void main(String[] args) {
        Employee e = new Employee("John Doe", 2500.0);

        System.out.println(e.getName());
        System.out.println("Salary -> " + e.getSalary());

        e.raiseSalary(0.15);

        System.out.println("Salary -> " + e.getSalary());

        Employee ee = new Employee("Mary Jane", 2500.0);
        System.out.println("First employee id: " + e.getId());
        System.out.println("Second employee id: " + ee.getId());
    }
}
