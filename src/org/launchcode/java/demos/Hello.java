package org.launchcode.java.demos;

import java.util.Scanner;
/**
 * From "Java Web Development"
 */
public class Hello {
    public static void main(String[] args) {
        double pi = 3.14;
        double radius;
        double area;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        radius = input.nextDouble();
        input.close();

        area = (pi*radius*radius);

        System.out.println("The area of a circle of radius: " + radius + " is: " + area);
    }
}
