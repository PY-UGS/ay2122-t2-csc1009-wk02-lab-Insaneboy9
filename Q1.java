package com.daryl;

import java.util.Scanner;
class Circle {
    double radius;

    Circle() {
        radius = 1;
    }

    Circle(double newRadius) {
        radius = newRadius;
    }

    double getArea() {
        return radius * radius * Math.PI;
    }

    double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    void setRadius(double newRadius) {
        radius = newRadius;
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println("Please enter the radius:");
	    Scanner input=new Scanner(System.in);
        float radius= input.nextFloat();
        Circle c= new Circle(radius);
        System.out.println(c.getArea());

    }
}
