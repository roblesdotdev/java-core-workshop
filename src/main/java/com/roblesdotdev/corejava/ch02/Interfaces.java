package com.roblesdotdev.corejava.ch02;

// An interface is a mechanism for spelling out a contract between two parties: the supplier of a service
// and the classes that want their objects to be usable with the service.

interface Person {
    String getName();
    default int getId() { return 0; }
}

interface Identified {
    default int getId() { return Math.abs(hashCode()); }
}

class EmployeeExtended implements Person, Identified {

    @Override
    public String getName() {
        return "Employee name";
    }

    @Override
    public int getId() {
        // Resolve Default method conflict
        // return Person.super.getId();
        return Identified.super.getId();
    }
}

public class Interfaces {
    public static void main(String[] args) {
        EmployeeExtended e = new EmployeeExtended();

        System.out.println("Employee id: " + e.getId());
        System.out.println("Employee name: " + e.getName());
    }
}
