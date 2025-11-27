package com.java.concept.inheritance;

public class Daughter extends MensFather{

    private double salary;

    public Daughter(double fullTimeSalary, double salary) {
        super(fullTimeSalary);
        this.salary = salary;
    }

    public void showIncome() {
        double total = getFullTimeSalary() + salary;
        System.out.println("Family total income with daughter: " + total);
    }


}
