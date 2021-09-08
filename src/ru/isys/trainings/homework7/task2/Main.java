package ru.isys.trainings.homework7.task2;

public class Main {

    private static HashedMap<String, Integer> hashMap = new HashedMap<String, Integer>(4);

    public static void main(String[] args) {
        fillHashMap(hashMap);
        testIsEmptyMethod();
        testContainsKeyMethod();
        testContainsValueMethod();
        testSizeMethod();
        testGetMethod();
        testRemoveMethod();
        testClearMethod();
    }

    private static void fillHashMap(HashedMap<String, Integer> hashMap) {
        hashMap.put("Victoria", 21);
        hashMap.put("Vladlena", 17);
        hashMap.put("Valentina", 46);
        hashMap.put("Sergey", 36);
        hashMap.put("Veniamin", 15);
        hashMap.put("Anna", 15);
        System.out.println("Now the map isn't empty...");
    }

    private static void testIsEmptyMethod() {
        System.out.print("Testing isEmpty() method: ");
        System.out.println(hashMap.isEmpty());
    }

    private static void testContainsKeyMethod() {
        System.out.println("Testing containsKey(K key) method: ");
        System.out.println("Is 'Vladlena' an existing key? " + hashMap.containsKey("Vladlena"));
        System.out.println("Is 'Vladislav' an existing key? " + hashMap.containsKey("Vladislav"));
    }

    private static void testContainsValueMethod() {
        System.out.println("Testing containsValue(V value) method: ");
        System.out.println("Does value 88 exist? " + hashMap.containsValue(88));
        System.out.println("Does value 15 exist?  " + hashMap.containsValue(15));
        System.out.println("Does value 17 exist? " + hashMap.containsValue(17));
    }

    private static void testSizeMethod() {
        System.out.println("Testing size() method: " + hashMap.size());
    }

    private static void testGetMethod() {
        System.out.println("Testing get(K key) method: ");
        System.out.println("Value of Valentina is " + hashMap.get("Valentina"));
        System.out.println("Value of Victoria is " + hashMap.get("Victoria"));
        System.out.println("Value of Ellie is " + hashMap.get("Ellie"));
    }

    private static void testRemoveMethod() {
        System.out.println("Testing remove(K key) method: ");
        System.out.println("Removing Anna from the collection...");
        hashMap.remove("Anna");
        System.out.println("Removing Sergey from the collection...");
        hashMap.remove("Sergey");
        System.out.println("Is Anna still in the collection? " + hashMap.containsKey("Anna"));
        System.out.println("Is Sergey still in the collection? " + hashMap.containsKey("Sergey"));
        System.out.println("Now size of the map is " + hashMap.size());
    }

    private static void testClearMethod() {
        System.out.println("Testing clear() method: ");
        System.out.println("Size before clearing: " + hashMap.size());
        System.out.println("Envoking clear()...");
        hashMap.clear();
        System.out.println("Size after clearing: " + hashMap.size());
        System.out.println("Is the map empty? " + hashMap.isEmpty());
    }
}
