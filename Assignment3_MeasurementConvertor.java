package Assignments.Assignment3;

import java.util.Scanner;

public class Assignment3_MeasurementConvertor {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        boolean keepGoing = true;
        while (keepGoing) {
            // Display conversion options
            System.out.println("Welcome to the measurement convertor!"+"\n"+"Here are the available conversions");
            System.out.println("1. Meters to feet");
            System.out.println("2. Feet to meters");
            System.out.println("3. Celsius to Fahrenheit");
            System.out.println("4. Fahrenheit to Celsius");
            System.out.println("5. Quit");
            System.out.println("Please choose a conversion:");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Meters to feet
                    System.out.print("Enter meters value: ");
                    double meters = scanner.nextDouble();
                    double feet = meters * 3.28084;
                    System.out.println(meters+" meters is equal to "+feet+" feet");
                    break;
                case 2:
                    // Feet to meters
                    System.out.print("Enter feet value: ");
                    feet = scanner.nextDouble();
                    meters = feet / 3.28084;
                    System.out.println(feet+" feet is equal to "+meters+" meters");
                    break;
                case 3:
                    // Celsius to Fahrenheit
                    System.out.print("Enter Celsius value: ");
                    double celsius = scanner.nextDouble();
                    double fahrenheit = (celsius * 9/5) + 32;
                    System.out.println(celsius+" degrees celsius is equal to "+fahrenheit+" degrees fahrenheit");
                    break;
                case 4:
                    // Fahrenheit to Celsius
                    System.out.print("Enter Fahrenheit value: ");
                    fahrenheit = scanner.nextDouble();
                    celsius = (fahrenheit - 32) * 5/9;
                    System.out.println(fahrenheit +" degrees fahrenheit is equal to " + celsius +" celsius");
                    break;
                case 5:
                    keepGoing = false;
                    System.out.println("Exiting Program!");
                    break;
                default:
                    System.out.println("Please choose a number between 1 and 5.");
            }
        } scanner.close();
    } 
}


