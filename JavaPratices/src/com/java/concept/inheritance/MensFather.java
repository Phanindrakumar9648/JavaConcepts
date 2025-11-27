package com.java.concept.inheritance;


/**
 * The MensFather class represents the parent class in a single inheritance example.
 *
 * This class stores the full-time salary value and provides a method to
 * retrieve it. The purpose of this class is to act as a base class from
 * which child classes can inherit common properties or behaviors.
 *
 * In this context, the full-time salary defined here is later combined
 * with additional values defined in the child class to demonstrate how
 * inheritance enables reuse of data and logic.
 */
public class MensFather {

    private double fullTimeSalary;

    /**
     * Constructs a MensFather object with the specified full-time salary.
     *
     * @param fullTimeSalary the salary value assigned to the parent class
     */
    public MensFather(double fullTimeSalary) {
        this.fullTimeSalary = fullTimeSalary;
    }

    /**
     * Returns the full-time salary stored in the parent class.
     *
     * @return the full-time salary value
     */
    public double getFullTimeSalary() {
        return fullTimeSalary;
    }
}
