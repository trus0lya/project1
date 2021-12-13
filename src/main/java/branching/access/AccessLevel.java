package branching.access;

import branching.entity.Data;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AccessLevel {
    private static final Logger logger = LogManager.getLogger(AccessLevel.class);
    private static final double password1 = 9583;
    private static final double password2 = 1747;
    private static final double password3 = 3331;
    private static final double password4 = 7922;
    private static final double password5 = 9555;
    private static final double password6 = 8997;
    private static final List<Double> listOfPasswords = List.of(password1, password2,
                                                                password3,password4,
                                                                password5, password6);
    private static final String a = "A";
    private static final String b = "B";
    private static final String c = "C";
    public static Optional<List<String>> determineAccessLevel(Data data){
        List<String> list = new ArrayList<>();
        if(!listOfPasswords.contains(data.getNum())){
            logger.log(Level.INFO, "No one has access");
            return Optional.empty();
        }
        if(data.getNum() == password6 || data.getNum() == password5){
           list.add(c);

        }
       else if(data.getNum() == password4 || data.getNum() == password3 ){
            list.add(c);
            list.add(b);
        }
        else if(data.getNum() == password2 || data.getNum() == password1){
            list.add(a);
            list.add(b);
            list.add(c);
        }
        logger.log(Level.INFO, "Someone has access");
        return Optional.of(list);
    }
}
