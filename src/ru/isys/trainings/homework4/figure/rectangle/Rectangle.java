package ru.isys.trainings.homework4.figure.rectangle;

import ru.isys.trainings.homework4.figure.Figure;

public class Rectangle implements Figure, Comparable<Rectangle> {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    @Override
    public double calculatePerimeter() {
        return length * 2 + width * 2;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public int compareTo(Rectangle rectangle) {
        return Double.compare(calculateArea(), rectangle.calculateArea());
    }
}
