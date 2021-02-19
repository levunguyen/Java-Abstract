package com.codegym;

public class Student extends Person {
    private String className;
    private double grade;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public void hoc() {
        System.out.println("Tham khao cac giao trinh o truong hoc.");
    }
}
