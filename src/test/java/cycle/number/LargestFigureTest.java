package cycle.number;

import cycle.entity.Data;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestFigureTest {
    Data data = new Data(5459053);

    @Test
    public void largestFigureTest(){
        int actual = LargestFigure.findLargestFigure(data);
        int expected = 9;
        assertEquals(actual, expected);
    }
}