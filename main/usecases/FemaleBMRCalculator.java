package main.usecases;

import main.entities.Person;

public class FemaleBMRCalculator implements BMRCalculator {
    /**
     * Returns the BMR which is double and is calculated as 10 * weight + 6.25 * height - 5 * age - 161
     @Param person it takes in the person object which is an entity
     @return  returns the BMR of person
     */
    @Override
    public double calculateBMR(Person person){
        double weight =  person.getWeight();
        double height = person.getHeight();
        int age = person.getAge();
        return 10 * weight + 6.25 * height - 5 * age - 161;
    }
}