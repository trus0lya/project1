package branching.function;

import branching.entity.Data;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionValueTest {

    Data data = new Data(9);
    @Test
    public void functionValueTest(){
       double actual =   FunctionValue.calculateFunctionValue(data);
       double expected = -81;
       assertEquals(actual, expected);
    }

}