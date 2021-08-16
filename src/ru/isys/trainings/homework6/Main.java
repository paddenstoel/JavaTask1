package ru.isys.trainings.homework6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        fillLists(arrayList, linkedList);
        addElementToListBeginning(arrayList, linkedList);
        addElementToMiddleOfList(arrayList, linkedList);
        addElementToTheEndOfList(arrayList, linkedList);
        deleteElementFromListBeginning(arrayList, linkedList);
        deleteElementFromMiddleOfList(arrayList, linkedList);
        deleteElementFromTheEndOfList(arrayList, linkedList);
        getElementFromBeginningOfList(arrayList, linkedList);
        getElementFromMiddleOfList(arrayList, linkedList);
        getElementFromTheEndOfList(arrayList, linkedList);
        getAllElementOfList(arrayList, linkedList);
    }

    public static void fillLists(List<String> arrayList, List<String> linkedList) {
        for (int i = 0; i < 1_000_000; i++) {
            arrayList.add(String.valueOf(UUID.randomUUID()));
            linkedList.add(String.valueOf(UUID.randomUUID()));
        }
    }

    public static void addElementToListBeginning(List<String> arrayList, List<String> linkedList) {
        System.out.println("Добавление нового элемента в начало списка:\n");

        long startTimeArr = System.nanoTime();
        arrayList.add(0, "xjgffkj");

        long estimatedTimeArr = System.nanoTime() - startTimeArr;
        System.out.println("Время для ArrayList: " + estimatedTimeArr);

        long startTimeLink = System.nanoTime();
        linkedList.add(0, "xjgffkj");

        long estimatedTimeLink = System.nanoTime() - startTimeLink;
        System.out.println("Время для LinkedList: " + estimatedTimeLink);
    }

    public static void addElementToMiddleOfList(List<String> arrayList, List<String> linkedList) {
        System.out.println("\nДобавление нового элемента в середину списка:\n");

        long startTimeArr = System.nanoTime();
        arrayList.add(500_000, "яааграигшщрушргкиш");

        long estimatedTimeArr = System.nanoTime() - startTimeArr;
        System.out.println("Время для ArrayList: " + estimatedTimeArr);

        long startTimeLink = System.nanoTime();
        linkedList.add(500_000, "яааграигшщрушргкиш");

        long estimatedTimeLink = System.nanoTime() - startTimeLink;
        System.out.println("Время для LinkedList: " + estimatedTimeLink);
    }

    private static void addElementToTheEndOfList(List<String> arrayList, List<String> linkedList) {
        System.out.println("\nДобавление нового элемента в конец списка:\n");

        long startTimeArr = System.nanoTime();
        arrayList.add("jkbgkjkgdbjb");

        long estimatedTimeArr = System.nanoTime() - startTimeArr;
        System.out.println("Время для ArrayList: " + estimatedTimeArr);

        long startTimeLink = System.nanoTime();
        linkedList.add("jkbgkjkgdbjb");

        long estimatedTimeLink = System.nanoTime() - startTimeLink;
        System.out.println("Время для LinkedList: " + estimatedTimeLink);
    }

    private static void deleteElementFromListBeginning(List<String> arrayList, List<String> linkedList) {
        System.out.println("\nУдаление элемента из начала списка: \n");

        long startTimeArr = System.nanoTime();
        arrayList.remove(0);

        long estimatedTimeArr = System.nanoTime() - startTimeArr;
        System.out.println("Время для ArrayList: " + estimatedTimeArr);

        long startTimeLink = System.nanoTime();
        linkedList.remove(0);

        long estimatedTimeLink = System.nanoTime() - startTimeLink;
        System.out.println("Время для LinkedList: " + estimatedTimeLink);
    }

    private static void deleteElementFromMiddleOfList(List<String> arrayList, List<String> linkedList) {
        System.out.println("\nУдаление элемента из середины списка: \n");

        long startTimeArr = System.nanoTime();
        arrayList.remove(500_000);

        long estimatedTimeArr = System.nanoTime() - startTimeArr;
        System.out.println("Время для ArrayList: " + estimatedTimeArr);

        long startTimeLink = System.nanoTime();
        linkedList.remove(500_000);

        long estimatedTimeLink = System.nanoTime() - startTimeLink;
        System.out.println("Время для LinkedList: " + estimatedTimeLink);
    }

    private static void deleteElementFromTheEndOfList(List<String> arrayList, List<String> linkedList) {
        System.out.println("\nУдаление элемента с конца списка: \n");

        long startTimeArr = System.nanoTime();
        arrayList.remove(1_000_000);

        long estimatedTimeArr = System.nanoTime() - startTimeArr;
        System.out.println("Время для ArrayList: " + estimatedTimeArr);

        long startTimeLink = System.nanoTime();
        linkedList.remove(1_000_000);

        long estimatedTimeLink = System.nanoTime() - startTimeLink;
        System.out.println("Время для LinkedList: " + estimatedTimeLink);
    }

    private static void getElementFromBeginningOfList(List<String> arrayList, List<String> linkedList) {
        System.out.println("\nПолучение элемента с начала списка: \n");

        long startTimeArr = System.nanoTime();
        arrayList.get(0);
        long estimatedTimeArr = System.nanoTime() - startTimeArr;
        System.out.println("Время для ArrayList: " + estimatedTimeArr);

        long startTimeLink = System.nanoTime();
        linkedList.get(0);
        long estimatedTimeLink = System.nanoTime() - startTimeLink;
        System.out.println("Время для LinkedList: " + estimatedTimeLink);
    }

    private static void getElementFromMiddleOfList(List<String> arrayList, List<String> linkedList) {
        System.out.println("\nПолучение элемента с середины списка: \n");

        long startTimeArr = System.nanoTime();
        arrayList.get(500_000);
        long estimatedTimeArr = System.nanoTime() - startTimeArr;
        System.out.println("Время для ArrayList: " + estimatedTimeArr);

        long startTimeLink = System.nanoTime();
        linkedList.get(500_000);
        long estimatedTimeLink = System.nanoTime() - startTimeLink;
        System.out.println("Время для LinkedList: " + estimatedTimeLink);
    }

    private static void getElementFromTheEndOfList(List<String> arrayList, List<String> linkedList) {
        System.out.println("\nПолучение элемента с конца списка: \n");

        long startTimeArr = System.nanoTime();
        arrayList.get(999_999);
        long estimatedTimeArr = System.nanoTime() - startTimeArr;
        System.out.println("Время для ArrayList: " + estimatedTimeArr);

        long startTimeLink = System.nanoTime();
        linkedList.get(999_999);
        long estimatedTimeLink = System.nanoTime() - startTimeLink;
        System.out.println("Время для LinkedList: " + estimatedTimeLink);
    }

    private static void getAllElementOfList(List<String> arrayList, List<String> linkedList) {
        System.out.println("\nПеребор всех элементов списка: \n");

        long startTimeArr = System.nanoTime();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i);
        }
        long estimatedTimeArr = System.nanoTime() - startTimeArr;
        System.out.println("Время для ArrayList: " + estimatedTimeArr);

        long startTimeLink = System.nanoTime();
        for (int i = 0; i < linkedList.size(); i++) {
            linkedList.get(i);
        }
        long estimatedTimeLink = System.nanoTime() - startTimeLink;
        System.out.println("Время для LinkedList: " + estimatedTimeLink);
    }


}
