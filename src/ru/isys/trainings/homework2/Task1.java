package ru.isys.trainings.homework2;

public class Task1 {

    public static void main(String[] args) {
        printMultiplesOfThree();
    }
    public static void printMultiplesOfThree() {
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
