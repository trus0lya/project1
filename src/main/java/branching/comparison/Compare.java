package branching.comparison;

import branching.entity.Data;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Compare {
    private static  final Logger logger = LogManager.getLogger(Compare.class);
    public static Data lessData(Data firstNum, Data secondNum){
        logger.log(Level.INFO, "Comparison occurred");
        return firstNum.getNum() < secondNum.getNum() ? firstNum : secondNum;
    }
}
