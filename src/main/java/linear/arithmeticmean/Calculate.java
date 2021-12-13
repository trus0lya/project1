package linear.arithmeticmean;

import linear.arithmeticmean.entity.ArithmeticMean;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculate {
    private static final Logger logger = LogManager.getLogger(Calculate.class);
    public static double calculateArithmeticMean(ArithmeticMean arithmeticMean){
        logger.log(Level.INFO, "The arithmetic mean of two numbers is calculated.");
        return (arithmeticMean.getFirstNum() + arithmeticMean.getSecondNum())/2;
    }
}
