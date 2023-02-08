package com.kodilla.school;

public class Student {
    private String name;
    private Grades maths;
    private Grades physics;
    private Grades geography;
    private Grades history;

    public Student(String name) {
        this.name = name;
        this.maths = new Grades();
        this.physics = new Grades();
        this.geography = new Grades();
        this.history = new Grades();
    }

    public void addMathGrade(int gradeMath) {
        if (gradeMath > 0 && gradeMath < 7) {
            this.maths.add(gradeMath);
        }
    }

    public void addPhysicsGrade(int gradePhysics) {
        if (gradePhysics > 0 && gradePhysics < 7) {
            this.physics.add(gradePhysics);
        }
    }

    public void addGeographyGrade(int gradeGeography) {
        if (gradeGeography > 0 && gradeGeography < 7) {
            this.geography.add(gradeGeography);
        }
    }

    public void addHistoryGrade(int gradeHistory) {
        if (gradeHistory > 0 && gradeHistory < 7) {
            this.history.add(gradeHistory);
        }
    }

    public double getMathsAverage() {
        return this.maths.getAverage();
    }

    public double getPhysicsAverage() {
        return this.physics.getAverage();
    }

    public double getGeographyAverage() {
        return this.geography.getAverage();
    }

    public double getHistoryAverage() {
        return this.history.getAverage();
    }

    public double getAverage() {
        double sum = this.geography.getAverage() + this.maths.getAverage() + this.physics.getAverage() + this.history.getAverage();
        return sum/4;
    }
}
