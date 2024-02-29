package com.gmail.natashachetty.util;

import java.util.Scanner;

public class Console {
    private static Scanner scanner = new Scanner(System.in);

    public static boolean askYorN(String message) {
        System.out.println(message + " (Y/N): ");
        String input = scanner.nextLine().trim().toLowerCase();
        return input.equals("y");
    }
}
