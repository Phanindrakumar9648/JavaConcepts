package com.java.concept.polymorphism;

import java.util.Date;

/**
 * complie time polymorphism(overloading)
 */
public class Calculator {

    void add(int a,int b){

        System.out.println(a+b);
    }

    void add(double a ,double b)
    {
        System.out.println(a+b);
    }

    void add(int a,int b, int c)
    {
        System.out.println(a+b+c);
    }

    public static void main(String[] args)
    {
        Calculator cal = new Calculator();
        cal.add(34,23,74);

        Calender test = new MyCalender();
        test.todayDate(new Date());
    }
}
