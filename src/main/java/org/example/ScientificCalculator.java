package org.example;

import java.util.Scanner;
import java.lang.Math;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class ScientificCalculator {

    private static final Logger logger = LogManager.getLogger(ScientificCalculator.class);

    public static void main(String[] args) {
//        Configurator.initialize("log4j2.xml"); // initialize Log4j

        Scanner scanner = new Scanner(System.in);
        while (true) {
            logger.info("Scientific Calculator");
            logger.info("1. Square root");
            logger.info("2. Factorial");
            logger.info("3. Natural logarithm");
            logger.info("4. Power");
            logger.info("5. Exit");
            logger.info("Enter your choice: ");


            try {
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        squareRoot();
                        break;
                    case 2:
                        factorial();
                        break;
                    case 3:
                        naturalLog();
                        break;
                    case 4:
                        power();
                        break;
                    case 5:
                        logger.info("Goodbye!");
                        System.exit(0);
                    default:
                        logger.info("Invalid choice");
                        break;
                }
            }
            catch(Exception e){
                logger.error("Error while taking input from user",e);
                scanner.nextLine();
            }
        }
    }

    public static void squareRoot() {
        Scanner scanner = new Scanner(System.in);

        logger.info("Enter a number: ");
        try {
            double x = scanner.nextDouble();
            double result = Math.sqrt(x);
            logger.info("The square root of " + String.format("%.2f", x) + " is " + String.format("%.2f", result));
        }
        catch(Exception e)
        {
            logger.error("Error while trying to find the square root of a given number", e);
        }

    }

    public static void factorial() {
        Scanner scanner = new Scanner(System.in);

        logger.info("Enter a number: ");
        try {
            int x = scanner.nextInt();
            int result = 1;

            for (int i = 1; i <= x; i++) {
                result *= i;
            }

            logger.info("The factorial of " + String.format("%d", x) + " is " + String.format("%d%n", result));
        }
        catch(Exception e){
            logger.error("Error while trying to find the factorial of a given number",e);
        }
    }

    public static void naturalLog() {
        Scanner scanner = new Scanner(System.in);

        logger.info("Enter a number: ");
        try {
            double x = scanner.nextDouble();
            double result = Math.log(x);
            logger.info("The natural logarithm of " + String.format("%.2f", x) + " is " + String.format("%.2f%n", result));
        }
        catch(Exception e ){
            logger.error("Error while trying to find the natural log of a given number",e);
        }
    }

    public static void power() {
        Scanner scanner = new Scanner(System.in);

        logger.info("Enter the base: ");
        try {
            double x = scanner.nextDouble();
            logger.info("Enter the exponent: ");
            double y = scanner.nextDouble();
            double result = Math.pow(x, y);
            logger.info(String.format("%.2f", x) + " raised to the power of " + String.format("%.2f", y) + " is " + String.format("%.2f%n", result));
        }
        catch(Exception e){
            logger.error("Error while trying to find the power of a given number for a given base",e);
        }
    }

}
