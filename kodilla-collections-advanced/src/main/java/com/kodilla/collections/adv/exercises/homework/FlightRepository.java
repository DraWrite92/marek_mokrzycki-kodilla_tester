package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    public static List<Flight> getFlightsTable(String departure, String arrival) {
        List<Flight> flightsTable = new ArrayList<>();
        flightsTable.add(new Flight("Warsaw POL", "Munich DEU"));
        flightsTable.add(new Flight("Amsterdam NLD", "New York USA"));
        flightsTable.add(new Flight("Rome ITA", "Tel Aviv ISR"));
        flightsTable.add(new Flight("Paris FRA", "London GBR"));
        flightsTable.add(new Flight("Tokio JPN", "Sydney AUS"));
        flightsTable.add(new Flight("Mexico City MEX", "Rio de Janeiro BRA"));
        flightsTable.add(new Flight("Madrid ESP", "Johannesburg ZAF"));
        flightsTable.add(new Flight("Toronto CAN", "Bogota COL"));
        return flightsTable;
    }
}
