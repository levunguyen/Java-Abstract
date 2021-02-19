package com.codegym;

public class Employee extends Person {
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void hoc() {
        System.out.println("Hoc cac nghiep vu ho tro cho cong viec.");
    }
}
