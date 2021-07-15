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

        int i = 0, j = 0;
        for (int k = 0; k < mergedBigArray.length; k++) {

            if (i > array.length - 1) {
                int a = anotherArray[j];
                mergedBigArray[k] = a;
                j++;
            } else if (j > anotherArray.length - 1) {
                int a = array[i];
                mergedBigArray[k] = a;
                i++;
            } else if (array[i] < anotherArray[j]) {
                int a = array[i];
                mergedBigArray[k] = a;
                i++;
            } else {
                int b = anotherArray[j];
                mergedBigArray[k] = b;
                j++;
            }

        }

        return mergedBigArray;
    }

}