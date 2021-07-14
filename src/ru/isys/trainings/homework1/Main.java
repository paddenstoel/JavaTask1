package ru.isys.trainings.homework1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");

        String input = scanner.nextLine();

        System.out.println("Hello, " + input);
        scanner.close();
    }
}
