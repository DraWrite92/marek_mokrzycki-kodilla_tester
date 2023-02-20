package com.kodilla.collections.adv.maps;

import java.util.HashMap;
import java.util.Map;

public class BasicMapExample {
    public static void main(String[] args) {
        Map<String, Double> grades = new HashMap<>();
        grades.put("Organizmy zarodnikowe i rośliny nasienne", 4.0);
        grades.put("Metodologia nauki", 5.0);
        grades.put("Biologia człowieka", 3.0);

        Double grade = grades.get("Metodologia nauki");
        System.out.println(grade);

        for(Map.Entry<String, Double> note : grades.entrySet()) {
            System.out.println("Ocena z przedmiotu " + note.getKey() + " wynosi " + note.getValue() + ".");
        }
    }
}
