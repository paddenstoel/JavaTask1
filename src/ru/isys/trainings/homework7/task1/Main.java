package ru.isys.trainings.homework7.task1;

public class Main {
    public static void main(String[] args) {
        LinkList<String> myList = new LinkList<>();

        testAddMethodWithoutIndex(myList);
        testAddWithIndexMethod(myList);
        testRemoveMethod(myList);
        testGetMethod(myList);
        testSetMethod(myList);
        testSizeMethod(myList);
        testIsEmptyMethod(myList);
        testClearMethod(myList);
    }

    private static void testAddMethodWithoutIndex(LinkList<String> myList) {
        System.out.println("add(E e): \n");

        myList.add("gkfjdkfg");
        myList.add("BubskeKJGa");
        myList.add("78wa47");
        myList.add("u8487");
        myList.add("kdghakjgh");
        myList.add("kjdfhghrduutyeury");
        myList.forEach(System.out::println);
    }

    private static void testAddWithIndexMethod(LinkList<String> myList) {
        System.out.println("\nadd(int index, E element): \n");

        myList.add(1, "B,dsn,voba");

        myList.forEach(System.out::println);
    }

    private static void testRemoveMethod(LinkList<String> myList) {
        System.out.println("\nremove(int index): \n");

        myList.remove(2);

        myList.forEach(System.out::println);
    }

    private static void testGetMethod(LinkList<String> myList) {
        System.out.println("\nget(int index): \n");

        System.out.println(myList.get(0));
    }

    private static void testSetMethod(LinkList<String> myList) {
        System.out.println("\nset(int index, E element): \n");

        myList.set(0, "leto");
        System.out.println(myList.get(0) + "\n");
        myList.forEach(System.out::println);
    }

    private static void testSizeMethod(LinkList<String> myList) {
        System.out.println("\nsize(): \n");

        System.out.println(myList.size());
    }

    private static void testIsEmptyMethod(LinkList<String> myList) {
        System.out.println("\nisEmpty(): \n");

        System.out.println(myList.isEmpty());
    }

    private static void testClearMethod(LinkList<String> myList) {
        System.out.println("\nclear(): \n");

        myList.clear();
        myList.forEach(System.out::println);
    }
}
