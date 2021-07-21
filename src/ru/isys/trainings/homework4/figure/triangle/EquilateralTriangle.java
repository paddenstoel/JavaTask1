package ru.isys.trainings.homework4.figure.triangle;

public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(double firstLength) {
        super(firstLength, firstLength, 60.0);
    }

    @Override
    public String toString() {
        return "EquilateralTriangle{" +
                "firstLength=" + firstLength +
                ", secondLength=" + secondLength +
                ", angle=" + angle +
                '}';
    }

    @Override
    public double calculatePerimeter() {
        return firstLength * 3;
    }
}
