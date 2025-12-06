package com.java.concept.polymorphism;

import java.util.Date;

public class MyCalender extends Calender{

    @Override
    void todayDate(Date date) {

        System.out.println("Parent date: " + new Date());
    }
}
