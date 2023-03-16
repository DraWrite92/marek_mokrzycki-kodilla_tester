package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> listOfStudents = new ArrayList<>();
        listOfStudents.add(new Student("Troni N'Boppa", null));
        listOfStudents.add(new Student("Speloo C'Shani", new Teacher("Fama Kr'Baja")));
        listOfStudents.add(new Student("Chera O'Bani", new Teacher("Cole R'Kunko")));
        listOfStudents.add(new Student("Niocia H'Nyarri", null));
        listOfStudents.add(new Student("Rilly O'Forma", new Teacher("Tronaii J'Broida")));
        listOfStudents.add(new Student("Yutar A'Cari", new Teacher("Foama Tr'Catta")));
        listOfStudents.add(new Student("Tami F'Dani", new Teacher("Dora U'Qani")));
        listOfStudents.add(new Student("Itheek M'Abik", new Teacher("Mondi X'Aenish")));
        listOfStudents.add(new Student("Kalou Kr'Dniani", null));
        listOfStudents.add(new Student("Leptu C'Arrid", new Teacher("Trelou Str'Novoo")));
        for (Student studentName : listOfStudents) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(studentName.getTeacher());
            String teacherName = optionalTeacher.orElse(new Teacher("<undefined>")).getName();

            System.out.println("Student: " + studentName + ", Teacher: " + teacherName);
        }
    }
}
