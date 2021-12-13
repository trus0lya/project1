package branching.function;

import branching.entity.Data;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FunctionValue {
    private static final Logger logger =  LogManager.getLogger(FunctionValue.class);
    public static double calculateFunctionValue(Data data){
        double result=0;
        if(data.getNum() >= 8){
            result = -data.getNum()* data.getNum() + data.getNum() -9;
        } else{
            try {
                result = 1/(Math.pow(data.getNum(), 4)-6);
            } catch (ArithmeticException exception){
                logger.log(Level.ERROR, "division by zero");
            }
        }
        logger.log(Level.INFO, "The value of the function is calculated");
        return result;
    }
}
