package com.roblesdotdev.corejava.ch03;

import com.roblesdotdev.corejava.ch02.Employee;

public class Inheritance {
    public static void main(String[] args) {
        Manager m = new Manager("John Doe", 2500.0, 1200);

        System.out.println(m.getSalary());


        // Is legal to assign an object from a subclass to a variable whose type is a superclass.
        Employee e = m; // OK

        System.out.println(e.getSalary());  // dynamic method lookup

        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Mary Jane", 1200);
        staff[1] = new Manager("Bob Manager", 1200, 300);
        staff[2] = new Employee("Daniel", 1200);

        for (Employee ee : staff) {
            System.out.println(ee.getSalary());
        }
    }
}
