package test;

import main.entities.ActivityLevel;
import main.entities.Gender;
import main.entities.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import main.usecases.MaleBMRCalculator;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaleBRMCalculatorTest {
    private Person male;

    @BeforeEach
    void setup(){
        Gender gender = Gender.MALE;
        ActivityLevel extraActive = ActivityLevel.EXTRA_ACTIVE;
        male = new Person(gender, 21, 70, 180, 2);
        male.setActivityLevel(extraActive);

    }

    @Test
    public void testGettersSetters(){
        assertEquals(21, male.getAge());
        assertEquals(70, male.getWeight());
        assertEquals(180, male.getHeight());
        assertEquals(2, male.getWeightToLose());
        male.setWeight(65);
        assertEquals(65, male.getWeight());
        male.setWeightToLose(4);
        assertEquals(4, male.getWeightToLose());
        assertEquals(1.9, male.getActivityLevel().getValue());
    }
    @Test
    public void testCalculateBMR() {
        // Test with some sample data
        MaleBMRCalculator calculator = new MaleBMRCalculator();
        double bmr = calculator.calculateBMR(male);
        assertEquals(1725, bmr);
    }
}
