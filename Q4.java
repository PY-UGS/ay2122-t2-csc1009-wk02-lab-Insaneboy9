package com.daryl;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args){
        System.out.println("Enter a year:");
        Scanner input= new Scanner(System.in);
        int year = input.nextInt();
        year=year%12;

        switch (year){
            case 0 -> System.out.println("monkey");
            case 1 -> System.out.println("rooster");
            case 2 -> System.out.println("dog");
            case 3 -> System.out.println("pig");
            case 4 -> System.out.println("rat");
            case 5 -> System.out.println("ox");
            case 6 -> System.out.println("tiger");
            case 7 -> System.out.println("rabbit");
            case 8 -> System.out.println("dragon");
            case 9 -> System.out.println("snake");
            case 10 -> System.out.println("horse");
            default -> System.out.println("sheep");
        }

    }
}
