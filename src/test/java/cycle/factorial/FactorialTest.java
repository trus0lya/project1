package cycle.factorial;


import cycle.entity.Data;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    Data data = new Data(6);
    @Test
    public void factorialTest(){
        int actual = Factorial.calculateFactorial(data);
        int expected = 720;
        assertEquals(actual, expected);
    }

}