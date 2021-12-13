import cycle.count.FindNumber;
import cycle.number.LargestFigure;
import linear.arithmeticmean.entity.ArithmeticMean;
import linear.arithmeticmean.Calculate;
import branching.access.AccessLevel;
import branching.entity.Data;
import branching.comparison.Compare;
import linear.pi.entity.Pi;
import linear.pi.action.PrintPi;
import linear.quadraticequation.entity.QuadraticEquation;
import branching.replacement.Replace;
import branching.sensor.Notify;
import linear.symbol.action.SymbolNumber;
import linear.symbol.entity.Symbol;

public class Main {
    public static void main(String[] args){
        ArithmeticMean arithmeticMean = new ArithmeticMean(4,3);
        System.out.println(Calculate.calculateArithmeticMean(arithmeticMean));
        Pi pi = new Pi();
        PrintPi.print();
        QuadraticEquation quadraticEquation = new QuadraticEquation(2,2,0);
        System.out.println(linear.quadraticequation.action.Calculate.calculateRootsOfQuadraticEquation(quadraticEquation));
        Symbol s = new Symbol('n');
        SymbolNumber.printPreviousCurrentAndNext();
        Data d1 = new Data(2);
        Data d2 = new Data(3);
        System.out.println(Compare.lessData(d1,d2));


        branching.entity.Data dd1 = new branching.entity.Data(6);
        branching.entity.Data dd2 = new branching.entity.Data(4);

        Replace.replace(dd1, dd2);
        System.out.println(dd1);
        System.out.println(dd2);

        branching.entity.Data d = new branching.entity.Data(50);
        Notify.notify(d);
        Data ddd = new Data(9583);
        System.out.println(AccessLevel.determineAccessLevel(ddd));

       // System.out.println(SumOfOdd.calculateSumOfOdd());


        cycle.entity.Data data = new cycle.entity.Data(469645);
        System.out.println(LargestFigure.findLargestFigure(data));
        cycle.entity.Data dh = new cycle.entity.Data(567);
        System.out.println(FindNumber.findNumber(dh));
    }
}
