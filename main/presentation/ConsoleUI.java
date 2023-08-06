package main.presentation;

import java.util.Scanner;

import main.entities.Person;
import main.entities.Gender;
import main.entities.ActivityLevel;
/**
 * This is the ConsoleUI and is what the user sees. Prompts all needed information so that the appropriate classes
 * can be called and output the caloric intake needed to lose weight. This is called by the CaloricWeightLossCalculator
 */
public class ConsoleUI {
    private static Scanner scanner = new Scanner(System.in);


    public static Person readPersonDetails() {
        Gender gender = null;
        int age = 0;
        double weight = 0.0;
        double height = 0.0;
        double weightToLose = 0.0;
        while (gender == null) {
            try {
                System.out.print("Enter the gender (MALE or FEMALE): ");
                String genderInput = scanner.nextLine().toUpperCase();
                gender = Gender.valueOf(genderInput);
            } catch (IllegalArgumentException ex) {
                System.out.println("Invalid gender. Please enter either MALE or FEMALE.");
            }
        }

        while (age <= 0) {
            try {
                System.out.print("Enter the age: ");
                age = Integer.parseInt(scanner.nextLine());
                if (age <= 0) {
                    System.out.println("Invalid age. Please enter a positive number.");
                }
            } catch (NumberFormatException ex) {
                System.out.println("Invalid age. Please enter a valid numeric age.");
            }
        }
        while (weight <= 0.0) {
            try {
                System.out.print("Enter the weight (kg): ");
                weight = Double.parseDouble(scanner.nextLine());
                if (weight <= 0.0) {
                    System.out.println("Invalid weight. Please enter a positive number.");
                }
            } catch (NumberFormatException ex) {
                System.out.println("Invalid weight. Please enter a valid numeric weight.");
            }
        }

        while (height <= 0.0) {
            try {
                System.out.print("Enter the height (cm): ");
                height = Double.parseDouble(scanner.nextLine());
                if (height <= 0.0) {
                    System.out.println("Invalid height. Please enter a positive number.");
                }
            } catch (NumberFormatException ex) {
                System.out.println("Invalid height. Please enter a valid numeric height.");
            }
        }

        while (weightToLose <= 0.0) {
            try {
                System.out.print("Enter how much weight (kg) you want to lose in a month: ");
                weightToLose = Double.parseDouble(scanner.nextLine());
                if (weightToLose <= 0.0) {
                    System.out.println("Invalid weight to lose. Please enter a positive number.");
                }
            } catch (NumberFormatException ex) {
                System.out.println("Invalid weight to lose. Please enter a valid numeric value.");
            }
        }

        System.out.println("Select the activity level:");
        System.out.println("1. Sedentary");
        System.out.println("2. Lightly Active");
        System.out.println("3. Moderately Active");
        System.out.println("4. Very Active");
        System.out.println("5. Extra Active");
        System.out.print("Enter the number corresponding to the activity level: ");
        int activityLevelChoice = scanner.nextInt();
        ActivityLevel activityLevel = getActivityLevelFromChoice(activityLevelChoice);
        Person person = new Person(gender, age, weight, height, weightToLose);
        person.setActivityLevel(activityLevel);
        return person;
    }

    private static ActivityLevel getActivityLevelFromChoice(int choice) {
        switch (choice) {
            case 1:
                return ActivityLevel.SEDENTARY;
            case 2:
                return ActivityLevel.LIGHTLY_ACTIVE;
            case 3:
                return ActivityLevel.MODERATELY_ACTIVE;
            case 4:
                return ActivityLevel.VERY_ACTIVE;
            case 5:
                return ActivityLevel.EXTRA_ACTIVE;
            default:
                throw new IllegalArgumentException("Invalid activity level choice.");
        }
    }
}