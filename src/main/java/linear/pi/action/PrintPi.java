package linear.pi.action;

import linear.pi.entity.Pi;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PrintPi {
    private static Pi pi = new Pi();
    private static final Logger logger = LogManager.getLogger(PrintPi.class);
    public static void print(){
        System.out.println(pi.piDegree(1));
        System.out.println(pi.piDegree(2));
        System.out.println(pi.piDegree(3));
        System.out.println(pi.piDegree(4));
        logger.log(Level.INFO,"4 powers of pi are displayed on the screen");
    }
}
