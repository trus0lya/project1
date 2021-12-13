package cycle.sum.action;

import cycle.sum.entity.Range;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SumOfOdd {
   private static final Logger logger = LogManager.getLogger(SumOfOdd.class);
    public static int calculateSumOfOdd(Range range){
        int i = range.getLowerBound();
        int sum = 0;
        while(i <= range.getUpperBound()){
            sum+=i;
            i+=2;
        }
        logger.log(Level.INFO, "The sum of odd numbers is calculated");
        return sum;
    }
}
