package org.example;

import java.util.Scanner;
import java.lang.Math;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class ScientificCalculator {

    private static final Logger logger = LogManager.getLogger(ScientificCalculator.class);

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Scientific Calculator");
            System.out.println("1. Square root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural logarithm");
            System.out.println("4. Power");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");


            try {
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Enter a number: ");
                        double x = scanner.nextDouble();
                        logger.info("[SQUARE-ROOT-INPUT] - "+String.format("%.2f",x));
                        double result = squareRoot(x);
                        System.out.printf("The square root of %.2f is %.2f\n.",x,result);
                        logger.info("[SQUARE-ROOT-OUTPUT] - "+String.format("%.2f", result));
                        break;
                    case 2:
                        System.out.print("Enter a number: ");
                        int a = scanner.nextInt();
                        logger.info("[FACTORIAL-INPUT] - "+String.format("%d",a));
                        int res = factorial(a);
                        System.out.printf("The factorial of %d is %d\n.",a,res);
                        logger.info("[FACTORIAL-OUTPUT] - "+String.format("%d", res));
                        break;
                    case 3:
                        System.out.print("Enter a number: ");
                        double inp = scanner.nextDouble();
                        logger.info("[NATURAL-LOG-INPUT] - "+String.format("%.2f",inp));
                        double res3 = naturalLog(inp);
                        System.out.printf("The natural logarithm of %.2f is %.2f\n.",inp,res3);
                        logger.info("[NATURAL-LOG-OUTPUT] - "+String.format("%.2f", res3));
                        break;
                    case 4:
                        System.out.print("Enter the base: ");
                        double x4 = scanner.nextDouble();
                        logger.info("[POWER-INPUT-BASE] - "+String.format("%.2f",x4));
                        System.out.print("Enter the exponent: ");
                        double y4 = scanner.nextDouble();
                        logger.info("[POWER-INPUT-BASE] - "+String.format("%.2f",y4));

                        double res4 = power(x4,y4);

                        System.out.printf(" %.2f raised to the power %.2f is %.2f\n.",x4,y4,res4);
                        logger.info("[POWER-OUTPUT] - "+String.format("%.2f", res4));
                        break;
                    case 5:
                        System.out.println("Goodbye!");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice");
                        break;
                }
            }
            catch(Exception e){
                logger.error("[ERROR-OPTION] - Error while taking input from user",e);
                scanner.nextLine();
            }
        }
    }

    public static double squareRoot(double x) {
        double result= 0.00;
        try {
             result = Math.sqrt(x);
        }
        catch(Exception e)
        {
            logger.error("[SQUARE-ROOT-ERROR] - Error while trying to find the square root of a given number", e);
        }
        return result;

    }

    public static int factorial(int x) {
        int result = 1;
        try {
            for (int i = 1; i <= x; i++) {
                result *= i;
            }

        }
        catch(Exception e){
            logger.error("[FACTORIAL-ERROR] - Error while trying to find the factorial of a given number",e);
        }
        return result;
    }

    public static double naturalLog(double x) {
        double result=0.00;
        try {

             result = Math.log(x);
        }
        catch(Exception e ){
            logger.error("[NATURAL-LOG-ERROR] - Error while trying to find the natural log of a given number",e);
        }
        return result;
    }

    public static double power(double x,double y) {
        double result=0.00;
        try {

           result = Math.pow(x, y);
        }
        catch(Exception e){
            logger.error("[POWER-ERROR] - Error while trying to find the power of a given number for a given base",e);
        }
        return result;
    }

}
