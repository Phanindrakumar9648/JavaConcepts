package com.java.concept;

import com.java.concept.inheritance.Daughter;
import com.java.concept.inheritance.Son;

/**
 * The TestHierarchy class is used to demonstrate hierarchical inheritance.
 *
 * In this example, both the Son and Daughter classes inherit from the
 * same parent class (MensFather). This class simply creates objects of
 * the child classes and calls their methods to show how each one uses
 * the inherited properties along with their own features.
 */
public class TestHierarchy {
    public static void main(String[] args) {

        Son son = new Son(30000, 10000);
        son.showTotalIncome();

        Daughter daughter = new Daughter(30000, 5000);
        daughter.showIncome();
    }
}
