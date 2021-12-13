package linear.quadraticequation.action;

import linear.quadraticequation.entity.QuadraticEquation;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class Calculate {
    private static final Logger logger = LogManager.getLogger(Calculate.class);
    public static List<Double> calculateRootsOfQuadraticEquation(QuadraticEquation quadraticEquation){
        if(quadraticEquation.getB() == 0 && quadraticEquation.getC() != 0){
            logger.log(Level.INFO, "The roots of the quadratic equation are calculated");
            return List.of(Math.sqrt(quadraticEquation.getC()/quadraticEquation.getA()),
                   -Math.sqrt(quadraticEquation.getC()/quadraticEquation.getA())
                    );
        }
        if(quadraticEquation.getC() == 0 && quadraticEquation.getB() != 0){
            logger.log(Level.INFO, "The roots of the quadratic equation are calculated");
            return List.of(0.0,
                    -Math.sqrt(quadraticEquation.getB()/ quadraticEquation.getA()));
        } else{
            logger.log(Level.INFO, "The roots of the quadratic equation are calculated");
            double d = quadraticEquation.getB()* quadraticEquation.getB() - 4* quadraticEquation.getA()* quadraticEquation.getC();
            return  List.of((-quadraticEquation.getB() - Math.sqrt(d)) / (2 * quadraticEquation.getA()),
                    (-quadraticEquation.getB() + Math.sqrt(d)) / (2 * quadraticEquation.getA()));

        }

    }
}
