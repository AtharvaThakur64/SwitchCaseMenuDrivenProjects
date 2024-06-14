package com.demo;

import java.util.Scanner;

public class meterconverter {

    public static void main(String[] args) {
        int choice;
        double length;
        Scanner sc = new Scanner(System.in);

        while (true) {
        	System.out.println("***************************");
            System.out.println("Welcome to Meter Converter");
            System.out.println("1. KM to M");
            System.out.println("2. M to KM");
            System.out.println("3. FEET TO INCHES");
            System.out.println("4. INCHES TO FEET");
            System.out.println("5. Exit");
            System.out.println("***************************");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Length in kilometers:");
                    length = sc.nextDouble();
                    System.out.println("Length in meters: " + length * 1000);
                    break;

                case 2:
                    System.out.println("Enter Length in meters:");
                    length = sc.nextDouble();
                    System.out.println("Length in kilometers: " + length / 1000);
                    break;

                case 3:
                    System.out.println("Enter Length in feet:");
                    length = sc.nextDouble();
                    System.out.println("Length in inches: " + length * 12);
                    break;

                case 4:
                    System.out.println("Enter Length in inches:");
                    length = sc.nextDouble();
                    System.out.println("Length in feet: " + length / 12);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return; // Exit the program

                default:
                    System.out.println("Please enter a proper choice.");
                    break;
            }

            System.out.println(); 
        }
    }
}
