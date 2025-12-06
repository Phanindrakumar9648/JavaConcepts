package com.java.concept;

import com.java.concept.inheritance.Women;

public class TestMutipleInheritance {

    public static void main(String[] args)
    {
        Women women = new Women();
        women.messageFromFather();
        women.messageFromMother();
    }
}
