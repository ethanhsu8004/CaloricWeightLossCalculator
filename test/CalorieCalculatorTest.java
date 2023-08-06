package test;
import org.junit.jupiter.api.Test;
import main.usecases.CalorieCalculator;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CalorieCalculatorTest {

    @Test
    public void testCaloriesNeeded() {
        double sampleCalc = CalorieCalculator.calculateCalorieIntakeForWeightLoss(1500, 1.5, 1.6);
        assertEquals(2015,sampleCalc);
    }

}
