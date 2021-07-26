package ru.isys.trainings.homework5.task2;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.Arrays;

public class Airline {
    private String destination;
    private int flightNumber;

    public enum AirlineType {
        CHARTER("Charter"),
        REGULAR("Regular");

        private String type;

        AirlineType(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }
    }

    private LocalTime departureTime;
    private DayOfWeek[] daysOfWeek;

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public DayOfWeek[] getDaysOfWeek() {
        return daysOfWeek;
    }

    public void setDaysOfWeek(DayOfWeek[] daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "destination='" + destination + '\'' +
                ", flightNumber=" + flightNumber +
                ", departureTime=" + departureTime +
                ", daysOfWeek=" + Arrays.toString(daysOfWeek) +
                '}';
    }

}
