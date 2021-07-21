package ru.isys.trainings.homework3;

import java.time.LocalTime;
import java.time.Duration;

public class Task3 {

    public static void main(String[] args) {

        LocalTime now = LocalTime.now();
        LocalTime midnight = LocalTime.MAX;

        Duration timeToMidnightLeft = Duration.between(now, midnight);

        System.out.println("There are " + timeToMidnightLeft.getSeconds() + " seconds left until midnight");

    }
}
