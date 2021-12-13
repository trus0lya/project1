package cycle.count;

import cycle.entity.Data;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FindNumber {
    private static final Logger logger = LogManager.getLogger(FindNumber.class);
    public static int findNumber(Data data){
        int lastNum = data.getNum()%10;
        int firstNum = (data.getNum()/10)%10;
        int newNum = firstNum*10+lastNum;
        logger.log(Level.INFO, "number found");
        return 7*newNum;
    }
}
