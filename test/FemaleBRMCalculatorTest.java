package test;
import main.entities.ActivityLevel;
import main.entities.Gender;
import main.entities.Person;
import main.usecases.FemaleBMRCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class FemaleBRMCalculatorTest {

    private Person female;
    @BeforeEach
    public void setup(){
        Gender gender = Gender.FEMALE;
        ActivityLevel activityLevel = ActivityLevel.SEDENTARY;
        female = new Person(gender, 26, 50, 160, 2);
        female.setActivityLevel(activityLevel);


    }


    /**
     * Tests the setters and getters for a female.
     */
    @Test
    public void testGettersSetters() {
        Assertions.assertEquals(26, female.getAge());
        Assertions.assertEquals(50, female.getWeight());
        Assertions.assertEquals(160, female.getHeight());
        Assertions.assertEquals(2, female.getWeightToLose());
        female.setWeight(80);
        Assertions.assertEquals(80, female.getWeight());
        female.setWeightToLose(1);
        Assertions.assertEquals(1, female.getWeightToLose());
        Assertions.assertEquals(1.2, female.getActivityLevel().getValue());
    }

    /**
     * Tests to make sure that the bmr is calculated correctly for a female
     */
    @Test
    public void testCalculateBMR() {
        FemaleBMRCalculator calculator = new FemaleBMRCalculator();
        double bmr = calculator.calculateBMR(female);
        Assertions.assertEquals(1209.0, bmr);
    }
}
