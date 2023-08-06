package main.usecases;
import main.entities.Person;

public class CalorieCalculator {

    /**
     * Calculates the caloric intake needed to burn weightToLose in a single month. It uses 30 days for a given month.
     * @param bmr the Basal Metabolic Rate
     * @param weightToLose the weight to lose for an individidual and is in kilograms
     * @param activityLevel the activity level of an individual and the factor is from 1.2 to 1.9
     */
    public static double calculateCalorieIntakeForWeightLoss(double bmr, double weightToLose, double activityLevel) {
        return Math.round(((bmr* activityLevel ) * 30 - (weightToLose * 7700)) / 30);
    }
}