package com.java.concept;

import java.util.Scanner;

public class ArmstrongNumberLen {

    public double armstrong(int a) {

        int d = String.valueOf(a).length();
        double b = a;
        double sum = 0;
        while (a > 0) {
            int seperate = a % 10;
            double square = Math.pow(seperate,d);
            sum = sum + square;
            a = a / 10;
        }
        if (sum == b) {
            System.out.println("Given number was armstrong:" + b);
        } else {
            System.out.println("Given number is not an armstrong:" + b);
        }
        return b;
    }

    public static void main(String[] args) {
        ArmstrongNumberLen a = new ArmstrongNumberLen();
        System.out.println("Enter an number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        a.armstrong(number);
    }
}
