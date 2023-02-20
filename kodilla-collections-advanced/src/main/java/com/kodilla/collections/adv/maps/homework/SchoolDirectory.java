package com.kodilla.collections.adv.maps.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schoolStruct = new HashMap<>();

        Principal kenneth = new Principal("Kenneth", "Morrison");
        Principal jessica = new Principal("Jessica", "Faber");
        Principal jane = new Principal("Jane", "Eyre");
        Principal gregory = new Principal("Gregory", "Monterey");

        School kennethSchool = new School(Arrays.asList(20, 12, 15, 15, 16, 13, 14, 21));
        School jessicaSchool = new School(Arrays.asList(10, 11, 12, 10, 13, 10, 12, 11));
        School janeSchool = new School(Arrays.asList(21, 22, 25, 26, 24, 23, 20, 27));
        School gregorySchool = new School(Arrays.asList(15, 16, 14, 15, 12, 11, 17, 15));

        schoolStruct.put(kenneth, kennethSchool);
        schoolStruct.put(jessica, jessicaSchool);
        schoolStruct.put(jane, janeSchool);
        schoolStruct.put(gregory, gregorySchool);

        for(Map.Entry<Principal, School> schoolEntry : schoolStruct.entrySet()) {
            System.out.println(schoolEntry.getKey().getPrincipalName() + " " + schoolEntry.getKey().getPrincipalSurname() + "'s school - average number of pupils: " + schoolEntry.getValue().getAverageNumber());
        }
    }
}
