package ru.isys.trainings.homework2;

public class Task4 {

    public static void main(String[] args) {

        System.out.println("Sum of series " + getSumOfSeries(5.5, 13));
        System.out.println("Exponent " + Math.exp(5.5));

    }

    public static int[] getFactorialArray(int n) {

        int[] array = new int[n];
        int factorial = 1;
        for (int i = 0; i < array.length; i++) {
            factorial *= i + 1;
            array[i] = factorial;
        }

        return array;
    }

    public static double[] getPowArray(double x, int n) {

        double[] array = new double[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.pow(x, i + 1);
        }
        return array;

    }

    public static double getSumOfSeries(double x, int n) {

        int[] array = getFactorialArray(n);
        double[] anotherArray = getPowArray(x, n);

        double result = 1.0;

        for (int i = 0; i < n; i++) {
            result += anotherArray[i] / (double) array[i];
        }

        return result;
    }

}
