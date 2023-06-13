package com.roblesdotdev.corejava.ch03;

enum Size {
    SMALL,
    MEDIUM,
    LARGE,
}

// Compare with ==
// Don't need toString
// Convert from string -> Size.valueOf("SMALL");   -> throw with invalid value

enum Operation {
    ADD,
    SUBTRACT
}
public class Enumerations {
    // All values
    public static void main(String[] args) {

        Size[] values = Size.values();

        for (Size s : values) {
            System.out.println("Size Value -> " + s);
        }
    }

    public static int eval(Operation op, int arg1, int arg2) {
        return switch (op) {
            case ADD -> arg1 + arg2;
            case SUBTRACT -> arg1 - arg2;
        };
    }

}
