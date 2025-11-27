package com.java.concept.inheritance;

/**
 * The Men class represents the child class in a single inheritance example.
 */
public class Son extends MensFather {

    private double partTimeSalary;

    public Son(double fullTimeSalary, double partTimeSalary) {
        super(fullTimeSalary);
        this.partTimeSalary = partTimeSalary;
    }

    public double getPartTimeSalary() {
        return partTimeSalary;
    }
    /**
     * Displays the combined income of the full-time salary and the part-time salary.
     */
    public void showTotalIncome() {
        double total = getFullTimeSalary() + partTimeSalary;
        System.out.println("Family Total income with son: " + total);
    }

    public static void main(String[] args) {
        Son son = new Son(30000, 10000);
        son.showTotalIncome();
    }
}
