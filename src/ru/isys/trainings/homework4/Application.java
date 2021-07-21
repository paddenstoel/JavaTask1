package ru.isys.trainings.homework4;

import ru.isys.trainings.homework4.figure.rectangle.Rectangle;
import ru.isys.trainings.homework4.figure.rectangle.Square;
import ru.isys.trainings.homework4.figure.triangle.EquilateralTriangle;
import ru.isys.trainings.homework4.figure.triangle.RightTriangle;

public class Application {
    public static void main(String[] args) {

        System.out.println("Rectangle's info:");
        Rectangle rectangle = new Rectangle(5, 4);
        System.out.println(rectangle.toString());
        System.out.print("Area is ");
        System.out.println(rectangle.calculateArea());
        System.out.print("Perimeter is ");
        System.out.println(rectangle.calculatePerimeter());

        System.out.println("Changed params:");
        rectangle.setLength(3);
        rectangle.setWidth(10);
        System.out.println(rectangle.toString());
        System.out.print("Area is ");
        System.out.println(rectangle.calculateArea());
        System.out.print("Perimeter is ");
        System.out.println(rectangle.calculatePerimeter());

        System.out.println("Square's info:");
        Square square = new Square(6);
        System.out.print("Area is ");
        System.out.println(square.calculateArea());
        System.out.print("Perimeter is ");
        System.out.println(square.calculatePerimeter());


        System.out.println("Right Triangle's info:");
        RightTriangle rightTr = new RightTriangle(12, 4);
        System.out.println(rightTr.toString());
        System.out.print("Area is ");
        System.out.println(rightTr.calculateArea());
        System.out.print("Perimeter is ");
        System.out.println(rightTr.calculatePerimeter());

        System.out.println("Equilateral Triangle's info");
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(9);
        System.out.println(equilateralTriangle.toString());
        System.out.print("Area is ");
        System.out.println(equilateralTriangle.calculateArea());
        System.out.print("Perimeter is ");
        System.out.println(equilateralTriangle.calculatePerimeter());
    }
}
