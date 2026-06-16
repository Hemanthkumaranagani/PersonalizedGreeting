package com.internship.greeting;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PersonalizedGreeting {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            int yearsTo100 = 100 - age;

            System.out.printf(
                    "Hello, %s! You are %d years old and have %d years until you turn 100.%n",
                    name, age, yearsTo100
            );

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid age.");
        }

        scanner.close();
    }
}

