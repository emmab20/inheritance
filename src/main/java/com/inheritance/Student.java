package com.inheritance;

public class Student extends User {

    public double gpa = 0;

    public Student(String name, double gpa) {
        super(name);
        this.gpa = gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void absent(int daysAbsent) {
        this.gpa -= daysAbsent * 0.01;
    }

    public void printInfo() {
        System.out.println(name + "'s GPA: " + this.gpa);
    }
}
