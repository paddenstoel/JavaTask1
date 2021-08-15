package ru.isys.trainings.homework4.figure.triangle;

import ru.isys.trainings.homework4.figure.Figure;

import java.util.Comparator;

public abstract class Triangle implements Figure, Comparable<Triangle> {

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

    @Override
    public int compareTo(Triangle triangle) {
        return Double.compare(calculatePerimeter(), triangle.calculatePerimeter());
    }

    public static class TriangleComparator implements Comparator<Triangle> {
        @Override
        public int compare(Triangle one, Triangle two) {
            return Double.compare(one.calculateArea(), two.calculateArea());
        }
    }
}
