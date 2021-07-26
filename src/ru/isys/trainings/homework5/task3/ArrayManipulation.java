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
        int dimension = 4;

        if (arr.length != dimension) {
            return false;
        }

        for (String[] strings : arr) {
            if (strings.length != dimension) {
                return false;
            }
        }
        return true;
    }
}
