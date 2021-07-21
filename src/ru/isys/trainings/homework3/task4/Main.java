package ru.isys.trainings.homework3.task4;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting working");
        measureTimeOfSelectionSortBySystemCurrent();
        measureTimeOfArraysSortBySystemCurrent();
        measureTimeOfSelectionSortByDuration();
        measureTimeOfArraysSortByDuration();
    }

    private static String[] createArray() {
        final int NUMBER_OF_ELEMENTS = 1_000_000;
        String[] array = new String[NUMBER_OF_ELEMENTS];
        return array;
    }

    private static String[] fillArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = String.valueOf(UUID.randomUUID());
        }
        return array;
    }

    private static void measureTimeOfSelectionSortBySystemCurrent() {
        StringsSortManager sorter = new SelectionSort();
        String[] filledArr = fillArray(createArray());
        long start = System.currentTimeMillis();
        sorter.sort(filledArr);
        long end = System.currentTimeMillis();
        long result = end - start;
        System.out.println("Using System.currentTimeMillis():");
        System.out.println("Runtime of selection sort is " + result);
    }

    private static void measureTimeOfSelectionSortByDuration() {
        StringsSortManager sorter = new SelectionSort();
        String[] filledArr = fillArray(createArray());
        System.out.println("Using LocalDateTime and Duration.between(): ");
        LocalDateTime start = LocalDateTime.now();
        sorter.sort(filledArr);
        LocalDateTime end = LocalDateTime.now();
        System.out.println("Runtime of selection sort is " + Duration.between(start, end).toMillis());
    }

    private static void measureTimeOfArraysSortBySystemCurrent() {
        StringsSortManager sorter = new ArraySort();
        String[] filledArr = fillArray(createArray());
        long start = System.currentTimeMillis();
        sorter.sort(filledArr);
        long end = System.currentTimeMillis();
        long result = end - start;
        System.out.println("Runtime of Arrays.sort() is " + result);
    }

    private static void measureTimeOfArraysSortByDuration() {
        StringsSortManager sorter = new ArraySort();
        String[] filledArr = fillArray(createArray());
        LocalDateTime start = LocalDateTime.now();
        sorter.sort(filledArr);
        LocalDateTime end = LocalDateTime.now();
        System.out.println("Runtime of Arrays.sort() is " + Duration.between(start, end).toMillis());
    }

}
