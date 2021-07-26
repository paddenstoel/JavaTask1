package ru.isys.trainings.homework5.task3;

public class ArrayManipulation {
    public static int getSumOfArrayElements(String[][] array) throws WrongArrayDataException {
        if (!isRightStructure(array)) {
            throw new UnsupportedArraySizeException("Wrong array size");
        }

        int result = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                try {
                    result += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new WrongArrayDataException("There is not a number in cell {" + i + ", " + j + "}");
                }

            }
        }
        return result;
    }

    private static boolean isRightStructure(String[][] arr) {
        return arr.length == 4 && arr[0].length == 4 && arr[1].length == 4 && arr[2].length == 4 && arr[3].length == 4;
    }

}
