package ru.isys.trainings.homework3;

public class Task1 {

    public static void main(String[] args) {

        System.out.println(createGetter("String", "name"));
        System.out.println(createGetter("int", "age"));
        System.out.println(createGetter("double", "balance"));

        System.out.println(createSetter("String", "name"));
        System.out.println(createSetter("int", "age"));
        System.out.println(createSetter("double", "balance"));

    }

    public static String createGetter(String type, String fieldName) {
        String code = "public " + type + " get" + makeBiggerFirstLetter(fieldName) + "() {\n\treturn this." + fieldName + ";\n}";
        return code;
    }

    public static String createSetter(String type, String fieldName) {
        String code = "public " + type + " set" + makeBiggerFirstLetter(fieldName) + "(" + type + " " + fieldName + ") {\n\treturn this." + fieldName + ";\n}";
        return code;
    }

    private static String makeBiggerFirstLetter(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

}
