package ru.isys.trainings.homework3.task4;

public class SelectionSort implements StringsSortManager {

    @Override
    public void sort(String[] array) {
        for (int j = 0; j < array.length - 1; j++) {
            int min = j;
            for (int k = j + 1; k < array.length; k++)
                if (array[k].compareTo(array[min]) < 0) min = k;

            String temp = array[j];
            array[j] = array[min];
            array[min] = temp;
        }
    }
}