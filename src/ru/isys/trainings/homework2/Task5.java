package ru.isys.trainings.homework2;

import java.util.Arrays;

public class Task5 {

    public static void main(String[] args) {

        int[] array = {2, 6, 9, 10};
        int[] array2 = {1, 3, 4, 5, 7, 8};

        System.out.println(Arrays.toString(getSortedAndMergedArray(array, array2)));

        int[] array3 = {2, 3, 5, 9, 16};
        int[] array4 = {0, 1, 3, 4, 5, 7};

        System.out.println(Arrays.toString(getSortedAndMergedArray(array3, array4)));

        int[] array5 = {-19, -9, 0, 12, 22, 33, 50, 160};
        int[] array6 = {-1, 30};

        System.out.println(Arrays.toString(getSortedAndMergedArray(array5, array6)));

        int[] array7 = {-85, 2, 5, 111, 415};
        int[] array8 = {-98, 5, 7, 333};

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