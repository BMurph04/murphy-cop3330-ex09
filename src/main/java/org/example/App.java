/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Brendon Murphy
 */
package org.example;
import java.util.Scanner;
import java.lang.Math;


public class App 
{
    public static void main( String[] args )
    {
        //input
        Scanner input = new Scanner(System.in);

        System.out.println("What is the length of the ceiling?");
        double ceilingLength = input.nextDouble();

        System.out.println("What is the width of the ceiling?");
        double ceilingWidth = input.nextDouble();

        //constants and computing
        double feetToGallon = 1.0/350.0;

        double ceilingArea = ceilingLength * ceilingWidth;

        double ceilingGallons = Math.ceil(ceilingArea * feetToGallon);

        //output
        System.out.println(String.format("You will need to purchase %.0f gallons of paint to cover %.2f square feet.", ceilingGallons, ceilingArea));

    }
}
