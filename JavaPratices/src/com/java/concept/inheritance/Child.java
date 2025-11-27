package com.java.concept.inheritance;

/**
 * The Child class represents the third level in a multilevel inheritance chain.
 *
 * This class extends the Men class, which itself extends the MensFather class.
 * As a result, the Child class inherits the full-time salary from the MensFather
 * class and the part-time salary from the Men class, and also introduces its own
 * additional salary component.
 *
 * This class demonstrates how multilevel inheritance allows a class to inherit
 * data and behavior from a parent, which itself has inherited from another parent,
 * forming a chain of reusable and extendable features.
 */
public class Child extends Son {

    private double additionalSalary;

    /**
     * Constructs a Child object with full-time salary inherited from the
     * grandparent class (MensFather), part-time salary inherited from the
     * parent class (Men), and an additional salary defined at this level.
     *
     * @param fullTimeSalary  the salary inherited from the MensFather class
     * @param partTimeSalary  the salary inherited from the Men class
     * @param additionalSalary the extra salary defined in the Child class
     */
    public Child(double fullTimeSalary, double partTimeSalary, double additionalSalary) {
        super(fullTimeSalary, partTimeSalary);
        this.additionalSalary = additionalSalary;
    }

    /**
     * Displays the total income combining the full-time salary,
     * part-time salary, and the additional salary introduced in this class.
     */
    public void showTotalIncome() {
        double total =
                getFullTimeSalary() +      // from MensFather
                        getPartTimeSalary() +      // from Men
                        additionalSalary;           // from Child

        System.out.println("Total income: " + total);
    }


    /**
     * Main method to run and demonstrate the multilevel inheritance example.
     * A Child object is created and total income is calculated by combining
     * all levels of inherited and own salary values.
     */
    public static void main(String[] args) {
        Child child = new Child(30000, 10000, 5000);
        child.showTotalIncome();
    }
}
