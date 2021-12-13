package linear.arithmeticmean;

import linear.arithmeticmean.entity.ArithmeticMean;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateArithmeticMeanTest {
    ArithmeticMean arithmeticMean = new ArithmeticMean(3,4);
    @Test
    public void testCalculateArithmeticMean(){
        double actual = Calculate.calculateArithmeticMean(arithmeticMean);
        double expected = 3.5;
        assertEquals(actual, expected);
    }
}