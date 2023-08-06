package test;

import main.entities.ActivityLevel;
import main.entities.Gender;
import main.entities.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import main.usecases.MaleBMRCalculator;
import org.junit.jupiter.api.Assertions;

public class MaleBRMCalculatorTest {
    private Person male;

    @BeforeEach
    void setup(){
        Gender gender = Gender.MALE;
        ActivityLevel extraActive = ActivityLevel.EXTRA_ACTIVE;
        male = new Person(gender, 21, 70, 180, 2);
        male.setActivityLevel(extraActive);

    }

    /**
     * Tests to make sure getters and setters work properly for a male
     */
    @Test
    public void testGettersSetters(){
        Assertions.assertEquals(21, male.getAge());
        Assertions.assertEquals(70, male.getWeight());
        Assertions.assertEquals(180, male.getHeight());
        Assertions.assertEquals(2, male.getWeightToLose());
        male.setWeight(65);
        Assertions.assertEquals(65, male.getWeight());
        male.setWeightToLose(4);
        Assertions.assertEquals(4, male.getWeightToLose());
        Assertions.assertEquals(1.9, male.getActivityLevel().getValue());
    }
    @Test
    /**
     * Tests to make sure that the bmr is calculated correctly for a male
     */
    public void testCalculateBMR() {
        // Test with some sample data
        MaleBMRCalculator calculator = new MaleBMRCalculator();
        double bmr = calculator.calculateBMR(male);
        Assertions.assertEquals(1725, bmr);
    }
}
