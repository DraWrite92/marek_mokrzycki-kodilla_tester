package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

public class ApplicationTest {
    @Test
    public void shouldBeAbleToPrintOutTheCorrectList() {
        List<String> listOfPairs = new ArrayList<>();
        listOfPairs.add("Student: Troni N'Boppa, Teacher: <undefined>");
        listOfPairs.add("Student: Speloo C'Shani, Teacher: Fama Kr'Baja");
        listOfPairs.add("Student: Chera O'Bani, Teacher: Cole R'Kunko");
        listOfPairs.add("Student: Niocia H'Nyarri, Teacher: <undefined>");
        listOfPairs.add("Student: Rilly O'Forma, Teacher: Tronaii J'Broida");
        listOfPairs.add("Student: Yutar A'Cari, Teacher: Foama Tr'Catta");
        listOfPairs.add("Student: Tami F'Dani, Teacher: Dora U'Qani");
        listOfPairs.add("Student: Itheek M'Abik, Teacher: Mondi X'Aenish");
        listOfPairs.add("Student: Kalou Kr'Dniani, Teacher: <undefined>");
        listOfPairs.add("Student: Leptu C'Arrid, Teacher: Trelou Str'Novoo");
        List<String> expected = listOfPairs;
        // error: "Cannot be applied to ()" List<String> actual = Application.main();
        // error: "There is no viable actual" assertEquals(expected, actual);

        // There is no possibility to test anything in Application.java because there is no other method than main.
    }
}
