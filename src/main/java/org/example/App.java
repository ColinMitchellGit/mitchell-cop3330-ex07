/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Colin Mitchell
 */

package org.example;
import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the length of the room in feet? ");
        int length = parseInt(input.nextLine());

        System.out.print("What is the width of the room in feet? ");
        int width = parseInt(input.nextLine());

        final double conversion_factor = 0.09290304;
        int area_feet = length * width;
        double area_meters = area_feet * conversion_factor;

        System.out.println("You entered dimensions of " + length + " feet by " + width + " feet.");
        System.out.println("The area is");
        System.out.println(area_feet + " square feet");
        System.out.println(area_meters + " square meters");
    }
}
