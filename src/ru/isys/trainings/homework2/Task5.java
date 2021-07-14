package ru.isys.trainings.homework2;

import java.util.Arrays;

public class Task5 {

    public static void main(String[] args) {

        int[] array = {2, 6, 9, 10};
        int[] array2 = {1, 3, 4, 5, 7, 8};

        System.out.println(Arrays.toString(getSortedAndMergedArray(array, array2)));

        int[] array3 = {5, 16, 9, 2, 3};
        int[] array4 = {1, 3, 4, 5, 7, 0};

        System.out.println(Arrays.toString(getSortedAndMergedArray(array3, array4)));

        int[] array5 = {50, 160, -9, 22, 33, 0, 12, -19};
        int[] array6 = {-1, 30};

        System.out.println(Arrays.toString(getSortedAndMergedArray(array5, array6)));

        int[] array7 = {2, 5, 111, -85, 415};
        int[] array8 = {333, 5, -98, 7};

        System.out.println(Arrays.toString(getSortedAndMergedArray(array7, array8)));

    }

    public static int[] getSortedAndMergedArray(int[] array, int[] anotherArray) {

        int firstArray = array.length;
        int secondArray = anotherArray.length;

        int[] mergedBigArray = new int[firstArray + secondArray];
        System.arraycopy(array, 0, mergedBigArray, 0, firstArray);
        System.arraycopy(anotherArray, 0, mergedBigArray, array.length, secondArray);

        sortArray(mergedBigArray);

        return mergedBigArray;

    }

    private static int[] sortArray(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1] < array[j]) {
                    int swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
            }
        }

        return array;
    }

}