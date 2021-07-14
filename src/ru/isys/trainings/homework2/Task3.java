package ru.isys.trainings.homework2;

public class Task3 {

    public static void main(String[] args) {

        int[] array = {7, 5, 9, 4, 8};
        findIndexOfMinNumber(array);
        findIndexOfMaxNumber(array);
        System.out.println();

        int[] array2 = {78, 69, -9, 4567, 1, 99};
        findIndexOfMinNumber(array2);
        findIndexOfMaxNumber(array2);
        System.out.println();

        int[] array3 = {-5, 99, 4487, -555, -878, 7745};
        findIndexOfMinNumber(array3);
        findIndexOfMaxNumber(array3);
        System.out.println();

        int[] array4 = {6, 8, 2, 0};
        findIndexOfMinNumber(array4);
        findIndexOfMaxNumber(array4);

    }

    public static void findIndexOfMinNumber(int[] array) {

        int minValue = array[0];
        int minIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }

        System.out.println("Index of min element is " + minIndex);
    }

    public static void findIndexOfMaxNumber(int[] array) {

        int maxValue = array[0];
        int maxIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
                maxIndex = i;
            }
        }

        System.out.println("Index of max element is " + maxIndex);
    }

}

