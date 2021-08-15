package ru.isys.trainings.homework4;

import ru.isys.trainings.homework4.figure.Figure;
import ru.isys.trainings.homework4.figure.rectangle.Rectangle;
import ru.isys.trainings.homework4.figure.rectangle.Square;
import ru.isys.trainings.homework4.figure.triangle.EquilateralTriangle;
import ru.isys.trainings.homework4.figure.triangle.RightTriangle;
import ru.isys.trainings.homework4.figure.triangle.Triangle;

import java.util.*;

public class Application {
    public static void main(String[] args) {

        ClassForHomeworkFour.printAllOfThisOut();
        ClassForHomeworkSix.printRectanglesInfo();
        ClassForHomeworkSix.printTrianglesInfo();
        ClassForHomeworkSix.createAndFillTreeMap();

        Map<Double, Rectangle> tree = ClassForHomeworkSix.createAndFillTreeMap();
        ClassForHomeworkSix.printTreeMapInfo(tree);

    }

    public static class ClassForHomeworkFour {
        public static void printAllOfThisOut() {
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

    public static class ClassForHomeworkSix {
        public static void printRectanglesInfo() {
            System.out.println("\nRectangles: ");

            List<Rectangle> rectangles = new ArrayList<>();

            rectangles.add(new Rectangle(5d, 4d));
            rectangles.add(new Rectangle(2d, 4d));
            rectangles.add(new Rectangle(11d, 2d));
            rectangles.add(new Rectangle(5.9, 4.6));
            rectangles.add(new Rectangle(45.99, 9d));

            System.out.println("\n-----------------Before sorting-----------------\n");
            printCollectionElements(rectangles);

            System.out.println("\n-----------------After sorting-----------------");

            Collections.sort(rectangles);

            printCollectionElements(rectangles);
        }

        public static void printTrianglesInfo() {
            System.out.println("\nTriangles:\n");
            List<Triangle> triangles = new ArrayList<>();

            triangles.add(new RightTriangle(2d, 6.8));
            triangles.add(new RightTriangle(1d, 5d));
            triangles.add(new RightTriangle(25.77, 16.8001));
            triangles.add(new EquilateralTriangle(5d));
            triangles.add(new EquilateralTriangle(67d));

            System.out.println("-----------------Before sorting-----------------\n");
            printCollectionElements(triangles);

            System.out.println("\n-----------------After sorting-----------------\n");
            Collections.sort(triangles);
            printCollectionElements(triangles);

            System.out.println("\n-----------------After sorting with comparator-----------------\n");
            Triangle.TriangleComparator comparator = new Triangle.TriangleComparator();
            triangles.sort(comparator);
            printCollectionElements(triangles);

        }

        private static void printCollectionElements(List<? extends Figure> figures) {
            for (Figure t : figures) {
                System.out.println(t + " ");
            }
        }

        public static Map<Double, Rectangle> createAndFillTreeMap() {
            Map<Double, Rectangle> tree = new TreeMap<>();

            Rectangle r1 = new Rectangle(5.9, 40d);
            Rectangle r2 = new Rectangle(699d, 45d);
            Rectangle r3 = new Rectangle(457d, 1.33);
            Rectangle r4 = new Rectangle(90d, 2.69);
            Rectangle r5 = new Rectangle(12d, 14.8);
            Rectangle r6 = new Rectangle(7d, 34d);

            tree.put(r1.calculatePerimeter(), r1);
            tree.put(r2.calculatePerimeter(), r2);
            tree.put(r3.calculatePerimeter(), r3);
            tree.put(r4.calculatePerimeter(), r4);
            tree.put(r5.calculatePerimeter(), r5);
            tree.put(r6.calculatePerimeter(), r6);

            return tree;
        }

        public static void printTreeMapInfo(Map<Double, Rectangle> tree) {
            System.out.println("\nTreeMap Rectangle's Info: \n");
            for (Map.Entry<Double, Rectangle> e : tree.entrySet()) {
                System.out.println(e.getKey() + "\t\t" + e.getValue());
            }
        }

    }
}


