package cycle.factorial;

import cycle.entity.Data;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Factorial {
    private static final Logger logger = LogManager.getLogger(Factorial.class);
    public static int calculateFactorial(){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Data data = new Data(num);
        int factorial = 1;
        for(int i=1;i<= num;++i){
            factorial*=i;
        }
        logger.log(Level.INFO, "The factorial of the number is calculated");
        return factorial;
    }
    public static int calculateFactorial(Data data){
        int factorial = 1;
        for(int i=1;i<= data.getNum();++i){
            factorial*=i;
        }
        logger.log(Level.INFO, "The factorial of the number is calculated");
        return factorial;
    }
}
