package cycle.count;


import cycle.entity.Data;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindNumberTest {
    Data data = new Data(567);

    @Test
    public void findNumberTest(){
        int actual = FindNumber.findNumber(data);
        int expected = 469;
        assertEquals(actual, expected);
    }
}