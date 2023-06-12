package com.roblesdotdev.corejava.ch01;

public class ControlFlow {

    public static void main(String[] args) {

        int count = 0;

        // If else
        if (count == 0) {
            System.out.println("The count is zero");
        } else {
            System.out.println("The count not is zero");
        }

        // Switch expression
        int seasonCode = 1;

        String season = switch (seasonCode) {
            case 0 -> "Spring";
            case 1 -> "Summer";
            case 2 -> "Fall";
            case 3 -> "Winter";
            default -> {
                System.out.println("???");
                yield "";
            }
        };

        System.out.println(season);

        // Switch Statement
        String seasonName;
        switch (seasonCode) {
            case 0 -> seasonName = "Spring";
            case 1 -> seasonName = "Summer";
            case 2 -> seasonName = "Fall";
            case 3 -> seasonName = "Winter";
            default -> {
                System.out.println("???");
                seasonName = "";
            }
        }
        System.out.println(seasonName);


        // Loops

        byte counter = 0;
        while (counter < 5) {
            System.out.println("The counter is " + counter);
            counter += 1;
        }

        // Do while
        do {
            System.out.println("The counter is " + counter);
            counter -= 1;
        } while (counter > 0);

        // Classic for

        for (int i = 0; i < 5; i++) {
            System.out.println("The i in the for loop is " + i);
        }

        // break -> exit loop
        // continue -> exit current loop iteration

    }
}
