package main;


import main.usecases.FemaleBMRCalculator;
import main.usecases.MaleBMRCalculator;
import main.usecases.CalorieCalculator;
import main.entities.Person;
import main.entities.Gender;
import main.presentation.ConsoleUI;
import main.usecases.BMRCalculator;


public class CaloricWeightLossCalculator {
    public static void main(String[] args) {
        Person person = ConsoleUI.readPersonDetails();

        BMRCalculator bmrCalculator;
        if (person.getGender() == Gender.MALE) {
            bmrCalculator = new MaleBMRCalculator();
        } else {
            bmrCalculator = new FemaleBMRCalculator();
        }

        double bmr =  bmrCalculator.calculateBMR(person);
        double calorieEachDay = CalorieCalculator.calculateCalorieIntakeForWeightLoss(bmr, person.getWeightToLose(), person.getActivityLevel().getValue());
        System.out.println("Your caloric intake each day should be " + calorieEachDay +" in order to lose " + person.getWeightToLose() + "kg in a month");
    }
}