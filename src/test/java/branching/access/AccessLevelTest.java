package branching.access;

import branching.entity.Data;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class AccessLevelTest {

    Data password  = new Data (9583);
    @Test
    public void accessLevelTest(){
        Optional<List<String>> actual = AccessLevel.determineAccessLevel(password);
        List<String> list = List.of("A", "B", "C");
        assertEquals(actual.get(), list);
    }

}