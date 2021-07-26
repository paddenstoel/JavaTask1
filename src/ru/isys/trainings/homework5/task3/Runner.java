package ru.isys.trainings.homework5.task3;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Case with not a number in array's cell:");
        test1();
        System.out.println("\nCase with wrong array size:");
        test2();
        System.out.println("\nPerfect case:");
        test3();
    }

    public static void test1() {
        String[][] array;
        array = new String[][]{
                {"56", "3", "1", "10"},
                {"12", "0", "2", "lk"},
                {"3", "100", "1", "1"},
                {"9", "1", "1", "8"}
        };

        try {
            System.out.println(ArrayManipulation.getSumOfArrayElements(array));
        } catch (WrongArrayDataException | UnsupportedArraySizeException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void test2() {
        String[][] array;
        array = new String[][]{
                {"56", "3", "1", "10", "66"},
                {"12", "0", "2", "21"},
                {"3", "100", "1", "1"},
                {"9", "1", "1", "8"}
        };

        try {
            System.out.println(ArrayManipulation.getSumOfArrayElements(array));
        } catch (WrongArrayDataException | UnsupportedArraySizeException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void test3() {
        String[][] array;
        array = new String[][]{
                {"56", "3", "1", "10"},
                {"12", "0", "2", "5"},
                {"3", "100", "1", "1"},
                {"9", "1", "1", "8"}
        };

        try {
            System.out.println(ArrayManipulation.getSumOfArrayElements(array));
        } catch (WrongArrayDataException | UnsupportedArraySizeException e) {
            System.out.println(e.getMessage());
        }

    }
}
