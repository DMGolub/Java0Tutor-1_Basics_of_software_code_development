package by.training.dmgolub.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    private static final Function<Double, Double> func = x -> x > 2 ? x : -x;

    @Test
    public void computeFunctionValue_should_when() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String expected = "-1.0" + System.lineSeparator()
                + "-2.0" + System.lineSeparator()
                + "3.0" + System.lineSeparator();

        Task2.computeFunctionValue(1, 3, 1, func);

        assertEquals(expected, out.toString());
    }
}