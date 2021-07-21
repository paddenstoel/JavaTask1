package ru.isys.trainings.homework4.figure.triangle;

public class RightTriangle extends Triangle {

    public RightTriangle(double firstLength, double secondLength) {
        super(firstLength, secondLength, 90.0);
    }

    @Override
    public double calculatePerimeter() {
        double hypotenuse = Math.sqrt(firstLength * firstLength + secondLength * secondLength);
        return firstLength + secondLength + hypotenuse;
    }

    @Override
    public String toString() {
        return "RightTriangle{" +
                "firstLength=" + firstLength +
                ", secondLength=" + secondLength +
                ", angle=" + angle +
                '}';
    }

}
