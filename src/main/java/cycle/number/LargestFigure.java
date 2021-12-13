package cycle.number;

import cycle.entity.Data;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LargestFigure {
    private static final Logger logger = LogManager.getLogger(LargestFigure.class);
    public static int findLargestFigure(Data data){
      int num =0;
        while(data.getNum() != 0){
            int ost = data.getNum()%10;
            if(ost > num){
                num = ost;
            }
            data.setNum(data.getNum()/10);
        }
        logger.log(Level.INFO, "The largest digit of the number is found");
        return num;
    }
}
