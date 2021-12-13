package linear.quadraticequation;

import linear.quadraticequation.action.Calculate;
import linear.quadraticequation.entity.QuadraticEquation;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalculateRootsTest {
    QuadraticEquation quadraticEquation = new QuadraticEquation(1,0,4);
    @Test
    public void calculateRootsTest(){
        List<Double> actual = Calculate.calculateRootsOfQuadraticEquation(quadraticEquation);
        List<Double> expected = List.of(2.0,-2.0);
        assertEquals(actual, expected);
    }
}