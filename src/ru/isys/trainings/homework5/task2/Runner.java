package ru.isys.trainings.homework5.task2;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class Runner {
    public static void main(String[] args) {
        Airline airline = new Airline();

        airline.setDestination("Cologne");
        airline.setFlightNumber(454);

        System.out.println(Airline.AirlineType.REGULAR.getType());
        LocalTime departure = LocalTime.of(04, 30);

        airline.setDepartureTime(departure);

        DayOfWeek[] daysOfWeekArr = new DayOfWeek[2];
        daysOfWeekArr[0] = DayOfWeek.SUNDAY;
        daysOfWeekArr[1] = DayOfWeek.MONDAY;
        airline.setDaysOfWeek(daysOfWeekArr);
        System.out.println(airline.toString());
    }
}
