package ru.isys.trainings.homework5.task1;

public class Main {
    public static void main(String[] args) {
        Computer acer = new Computer("Windows 10", "Ryzen 3 2200U", "8,00 GB");
        System.out.println(acer.getComputerInfo().getOs());
        System.out.println(acer.getComputerInfo().getCpu());
        System.out.println(acer.getComputerInfo().getRam());
    }
}
