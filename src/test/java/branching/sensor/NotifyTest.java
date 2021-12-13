package branching.sensor;

import branching.entity.Data;
import org.junit.After;

import org.junit.Before;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class NotifyTest {
    Data data = new Data(65);

    private final ByteArrayOutputStream output = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(output));
    }

    @Test
    public void notifyTest(){
        Notify.notify(data);
        String actual = output.toString();
        String expected = "Fire-hazardous situation!";
        assertEquals(actual, expected);
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

}