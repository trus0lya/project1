package cycle.sum.action;

import cycle.sum.entity.Range;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfOddTest {

    Range range = new Range(1,99);
    @Test
    public  void sumOfOddTest(){
       int actual = SumOfOdd.calculateSumOfOdd(range);
       int expected = 2500;
       assertEquals(actual, expected);
    }
}