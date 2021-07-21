package ru.isys.trainings.homework4.figure.triangle;

import ru.isys.trainings.homework4.figure.Figure;

public abstract class Triangle implements Figure {

    protected double firstLength;
    protected double secondLength;
    protected double angle;

    public Triangle(double firstLength, double secondLength, double angle) {
        this.firstLength = firstLength;
        this.secondLength = secondLength;
        this.angle = angle;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "firstLength=" + firstLength +
                ", secondLength=" + secondLength +
                ", angle=" + angle +
                '}';
    }

    @Override
    public double calculateArea() {
        double radianAngle = (Math.PI * angle) / 180.0;
        return 0.5 * firstLength * secondLength * Math.sin(radianAngle);
    }
}
