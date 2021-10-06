package ru.isys.trainings.homework8;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = firstTask();

        System.out.println("Names with 3 vowels: \n");
        printNamesWithVowels(names, 3);

        System.out.println("\nNames with 4 vowels: \n");
        printNamesWithVowels(names, 4);

        System.out.println("\nNames with 5 vowels: \n");
        printNamesWithVowels(names, 5);

        System.out.println("\nMin and max names: \n");
        printMinAndMaxNames(names);

        System.out.print("\nFirst name starting with E: ");
        printFirstNameStartingWithE(names);

        System.out.print("\nDoes every name have at least 1 vowel? " + isEveryNameContainingAVowel(names) + "\n\n");

        System.out.println("Map \"Name => Name length\":\n");
        printNamesAndLengthsToMap(names);

        System.out.println("\nGrouped by name length treemap:\n");
        printTreeMapWithGroupingBy(names);

        System.out.println("\nMap with partitioning:\n");
        printNamesWithPartitioningBy(names);

        System.out.println("\nGrouped by name length treemap without using Stream API:\n");
        printTreeMapWithoutStreamAPI(names);
    }

    public static List<String> firstTask() {
        String[] namesArray = Names.getNames().split("\n");

        return Arrays.stream(namesArray).filter(e -> !e.isBlank())
                .filter(e -> !e.contains("Имена для девочки на букву"))
                .map(Main::trimString)
                .map(Main::removeComma)
                .sorted()
                .collect(Collectors.toList());
    }

    public static void printNamesWithVowels(List<String> listNames, int vowels) {
        listNames.stream().filter(e -> countVowels(e) == vowels).forEach(System.out::println);
    }

    public static void printMinAndMaxNames(List<String> listNames) {
        Comparator<String> comparator = Comparator.comparing(String::length);
        String minName = listNames.stream().min(comparator).orElse("Минимальное значение не найдено");
        System.out.println(minName);
        String maxName = listNames.stream().max(comparator).orElse("Максимальное значение не найдено");
        System.out.println(maxName);
    }

    public static void printFirstNameStartingWithE(List<String> listNames) {
        String firstName = listNames
                .stream()
                .filter(e -> e.startsWith("Е"))
                .findFirst()
                .orElse("Нет имени на букву Е");
        System.out.println(firstName);
    }

    public static boolean isEveryNameContainingAVowel(List<String> listNames) {
        return listNames.stream().allMatch(e -> countVowels(e) != 0);
    }

    public static void printNamesAndLengthsToMap(List<String> listNames) {
        Map<String, Integer> namesMap = listNames
                .stream()
                .distinct()
                .collect(Collectors.toMap(s -> s, String::length));

        for (Map.Entry<String, Integer> entry : namesMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }

    public static void printTreeMapWithGroupingBy(List<String> listNames) {
        TreeMap<Integer, List<String>> groupByLength = new TreeMap<>(listNames.stream()
                .collect(Collectors.groupingBy(String::length)));

        for (Map.Entry<Integer, List<String>> entry : groupByLength.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }

    public static void printTreeMapWithoutStreamAPI(List<String> listNames) {
        Map<Integer, List<String>> map = new TreeMap<>();
        for (String name : listNames) {
            if (map.containsKey(name.length())) {
                map.get(name.length()).add(name);
            } else {
                List<String> list = new ArrayList<>();
                list.add(name);
                map.put(name.length(), list);
            }
        }
        for (Map.Entry<Integer, List<String>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }

    public static void printNamesWithPartitioningBy(List<String> listNames) {
        TreeMap<Boolean, List<String>> partitionByFirstLetter = new TreeMap<>(listNames.stream()
                .collect(Collectors.partitioningBy(Main::isFirstLetterVowel)));

        for (Map.Entry<Boolean, List<String>> entry : partitionByFirstLetter.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }

    private static String trimString(String str) {
        int index = str.indexOf(" ");
        if (index == -1) {
            return str;
        }
        return str.substring(0, index);
    }

    private static int countVowels(String str) {
        str = str.toLowerCase();
        int counter = 0;
        Set<Character> vowels = Set.of('а', 'и', 'е', 'ё', 'о', 'у', 'ы', 'э', 'ю', 'я');
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (vowels.contains(currentChar)) {
                counter++;
            }
        }
        return counter;
    }

    private static String removeComma(String str) {
        int index = str.indexOf(",");
        if (index == -1) {
            return str;
        }
        return str.substring(0, index);
    }

    private static boolean isFirstLetterVowel(String str) {
        return str.startsWith("А")
                || str.startsWith("И")
                || str.startsWith("О")
                || str.startsWith("Е")
                || str.startsWith("У")
                || str.startsWith("Э")
                || str.startsWith("Ю")
                || str.startsWith("Я");
    }
}
