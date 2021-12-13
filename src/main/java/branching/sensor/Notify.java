package branching.sensor;


import branching.entity.Data;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Notify {
    private static final double limit =60;
    private static final Logger logger = LogManager.getLogger(Notify.class);
    public static void notify(Data data){
        if(data.getNum() >= limit){
            System.out.print("Fire-hazardous situation!");
            logger.log(Level.INFO, "A fire warning has been triggered");
        }
        logger.log(Level.INFO, "A fire warning has not been triggered");
    }
}
