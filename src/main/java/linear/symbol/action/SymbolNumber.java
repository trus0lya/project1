package linear.symbol.action;

import linear.symbol.entity.Symbol;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SymbolNumber {
    private static Symbol symbol = new Symbol();
    private static final Logger logger = LogManager.getLogger(SymbolNumber.class);
    public static void printPreviousCurrentAndNext(){
        System.out.println(Integer.valueOf(symbol.getCh()));
        System.out.println((char)((int) symbol.getCh() -1));
        System.out.println((char)((int) symbol.getCh() +1));
        logger.log(Level.INFO, "Previous and next characters found");
    }
}
