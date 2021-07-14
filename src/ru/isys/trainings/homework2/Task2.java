package ru.isys.trainings.homework2;

public class Task2 {

    public static void main(String[] args) {

        printFilteredByParamsNumbers(10, 2);
        printFilteredByParamsNumbers(1, 7);
        printFilteredByParamsNumbers(5, 11);
        printFilteredByParamsNumbers(3, 26);
        printFilteredByParamsNumbers(88, 4);
    }

    public static void printFilteredByParamsNumbers(int n, int k) {

        int quantity = 0;

        for (int i = 1; quantity < n; i++) {
            if (i % k == 0) {
                System.out.print(i + " ");
                quantity++;
            }
        }

        System.out.println("\nTotal count: " + quantity + "\n");

    }

}


