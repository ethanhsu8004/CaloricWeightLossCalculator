package main.usecases;

import main.entities.Person;

/**
 * BMRCalculator is an interface Basal Metabolic Rate (BMR) using
 * Mifflin-St Jeor's equation for both male and female individuals.
 * A person needs to be defined before calculateBMR method is called
 */
public interface BMRCalculator {
    double calculateBMR(Person person);

}
