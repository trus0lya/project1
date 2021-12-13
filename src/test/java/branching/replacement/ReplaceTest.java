package branching.replacement;

import branching.entity.Data;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReplaceTest {

    Data firstData = new Data(2);
    Data secondData = new Data(4);

    @Test
    public  void replaceTest(){
        Replace.replace(firstData,secondData);
        double expectedFirstData = 3;
        double expectedSecondData = 16;

        boolean condition = expectedFirstData == firstData.getNum() && expectedSecondData == secondData.getNum();
        assertTrue(condition);
    }

}