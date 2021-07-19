package ru.isys.trainings.homework3;

public class Task2 {
    public static void main(String[] args) {

        Student[] students = new Student[5];

        students[0] = new Student(1, "Victoria", 5000.0);
        students[1] = new Student(2, "Valeria", 1.566);
        students[2] = new Student(3, "Vladlen", null);
        students[3] = new Student(4, "Victor", 26.328);
        students[4] = new Student(5, "Valentina", 3.789);

        printToConsole(students);
    }

    public static void printToConsole(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].toString());
        }
    }
}
