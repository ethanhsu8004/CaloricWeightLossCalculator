package test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import main.usecases.CalorieCalculator;

public class CalorieCalculatorTest {


    @Test
    public void testCaloriesNeeded() {
        double sampleCalc = CalorieCalculator.calculateCalorieIntakeForWeightLoss(1500, 1.5, 1.6);
        Assertions.assertEquals(2015, sampleCalc);
    }

}
