package com.java.concept;

public class ArmstrongNumber {

    public int armstrongNo(int a) {
        int b = a;
        int sum = 0;
        while (a > 0) {
            int seperate = a % 10;
            int square = seperate * seperate * seperate;
            sum = sum + square;
            a = a / 10;
        }
        if (sum == b) {
            b = sum;
            System.out.println("Given number was armstrong:" + b);
        } else {
            System.out.println("Given number is not an armstrong:" + b);
        }
        return b;
    }

    public static void main(String[] args) {
        ArmstrongNumber a = new ArmstrongNumber();
        a.armstrongNo(153);
        //anagaram
    }
}
