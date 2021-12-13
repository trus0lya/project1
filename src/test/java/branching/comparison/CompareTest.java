package branching.comparison;

import branching.entity.Data;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompareTest {
    Data firstDate = new Data(3.2);
    Data secondDate = new Data(3.1);
    @Test
    public void compareTest(){
        Data actual = Compare.lessData(firstDate, secondDate);
        Data expected = secondDate;
        assertEquals(actual, expected);
    }
}