package com.daryl;

import java.util.Scanner;

public class Q2{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter the first number:");
        float first= input.nextFloat();
        System.out.println("Please enter the second number:");
        float second= input.nextFloat();
        System.out.println("Please enter the third number:");
        float third= input.nextFloat();
        float avg= (first+second+third)/3;
        System.out.println("The average of " + first + ", " + second + ", " + third + " is " + avg);

    }
}
