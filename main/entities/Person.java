
package main.entities;
public class Person {
    private Gender gender;
    private int age;
    private double weight; // kg
    private double height;
    private double weightToLose;
    private ActivityLevel activityLevel;

    /**
     * Constructor for the Person class
     * @param age in years for the Person
     * @param height  unit is in cm
     * @param weight weight of the person is in kg
     * @param weightToLose weight that the person wants to lose
     */
    public Person(Gender gender, int age, double weight, double height, double weightToLose) {
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.weightToLose = weightToLose;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeightToLose() {
        return weightToLose;
    }

    public void setWeightToLose(double weightToLose) {
        this.weightToLose = weightToLose;
    }


    public void setActivityLevel(ActivityLevel activityLevel) {
        this.activityLevel = activityLevel;
    }
    public ActivityLevel getActivityLevel() {
        return activityLevel;
    }


}
