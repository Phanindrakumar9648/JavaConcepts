package com.java.concept;

public class SumOfCubes {


    public int sumOfCubes(int a)
    {
        int sum =0;
        while(a>0)
        {
            int divide = a%10; //123-> 3
            int cube = divide * divide *divide;
            sum = sum + cube;
            a = a/10;   //123-> 12
        }
        System.out.println(sum);
        return sum;
    }

    public static void main (String[] args)
    {
        SumOfCubes add = new SumOfCubes();
        add.sumOfCubes(123);
    }

}
