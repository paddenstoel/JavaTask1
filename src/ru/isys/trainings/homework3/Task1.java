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
        String code = "public " + type + " get" + checkFirstLetter(fieldName) + "() {\n\treturn this." + fieldName + ";\n}";
        return code;
    }

    public static String createSetter(String type, String fieldName) {
        String code = "public " + type + " set" + checkFirstLetter(fieldName) + "(" + type + " " + fieldName + ") {\n\treturn this." + fieldName + ";\n}";
        return code;
    }

    private static String checkFirstLetter(String str) {
        char[] arr = str.toCharArray();
        char firstCharacter = arr[0];
        return String.valueOf(firstCharacter).toUpperCase() + str.substring(1);
    }

}
