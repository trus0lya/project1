package branching.replacement;

import branching.entity.Data;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Replace {
    private static final Logger logger = LogManager.getLogger(Replace.class);
    public static void replace(Data firstNum, Data secondNum){
        double val = firstNum.getNum();
        double a = (firstNum.getNum()+secondNum.getNum())/2;
        double b = 2*firstNum.getNum()*secondNum.getNum();
        if(val > secondNum.getNum()){
            firstNum.setNum(b);
            secondNum.setNum(a);
        }else{
            firstNum.setNum(a);
            secondNum.setNum(b);
        }
        logger.log(Level.INFO, "The replacement was successful");
    }
}
