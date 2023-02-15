package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Ptaki polskich parków - 5216 Wróbel", "51×39,5 mm", false));
        stamps.add(new Stamp("16. Międzynarodowy Konkurs Skrzypcowy im. Henryka Wieniawskiego - 5256", "31,25×39,5 mm", false));
        stamps.add(new Stamp("Mikołów - 5278", "43×31,25 mm", false));
        stamps.add(new Stamp("Kwiaty i owoce - 4289 Nagietek", "25,5×31,25 mm", true));
        stamps.add(new Stamp("Mikołów - 5278", "43×31,25 mm", false));
        stamps.add(new Stamp("400-lecie Zamku Królewskiego w Warszawie - 4966", "51×31,25 mm", true));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps) {
            System.out.println(stamp);
        }
    }
}
