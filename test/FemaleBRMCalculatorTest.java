package test;
import main.entities.ActivityLevel;
import main.entities.Gender;
import main.entities.Person;
import main.usecases.FemaleBMRCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class FemaleBRMCalculatorTest {

    private Person female;
    @BeforeEach
    public void setup(){
        Gender gender = Gender.FEMALE;
        ActivityLevel activityLevel = ActivityLevel.SEDENTARY;
        female = new Person(gender, 26, 50, 160, 2);
        female.setActivityLevel(activityLevel);


    }

    @Test
    public void testGettersSetters() {
        assertEquals(26, female.getAge());
        assertEquals(50, female.getWeight());
        assertEquals(160, female.getHeight());
        assertEquals(2, female.getWeightToLose());
        female.setWeight(80);
        assertEquals(80, female.getWeight());
        female.setWeightToLose(1);
        assertEquals(1, female.getWeightToLose());
        assertEquals(1.2, female.getActivityLevel().getValue());
    }
    @Test
    public void testCalculateBMR() {
        FemaleBMRCalculator calculator = new FemaleBMRCalculator();
        double bmr = calculator.calculateBMR(female);
        assertEquals(1209.0, bmr);
    }
}
