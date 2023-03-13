package org.example;

import java.util.Scanner;
import java.lang.Math;

public class ScientificCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Scientific Calculator");
            System.out.println("1. Square root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural logarithm");
            System.out.println("4. Power");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

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
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }

    public static void squareRoot() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double x = scanner.nextDouble();
        double result = Math.sqrt(x);
        System.out.printf("The square root of %.2f is %.2f%n", x, result);
    }

    public static void factorial() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = scanner.nextInt();
        int result = 1;

        for (int i = 1; i <= x; i++) {
            result *= i;
        }

        System.out.printf("The factorial of %d is %d%n", x, result);
    }

    public static void naturalLog() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double x = scanner.nextDouble();
        double result = Math.log(x);
        System.out.printf("The natural logarithm of %.2f is %.2f%n", x, result);
    }

    public static void power() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base: ");
        double x = scanner.nextDouble();
        System.out.print("Enter the exponent: ");
        double y = scanner.nextDouble();
        double result = Math.pow(x, y);
        System.out.printf("%.2f raised to the power of %.2f is %.2f%n", x, y, result);
    }

}
