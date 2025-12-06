package com.java.concept.inheritance;

import com.java.concept.interfaces.Father;
import com.java.concept.interfaces.Mother;

public class Women implements Father, Mother {

    @Override
    public void messageFromFather() {
        System.out.println("Driver Safely");
    }

    @Override
    public void messageFromMother() {
        System.out.println("Takecare of your health");
    }
}
