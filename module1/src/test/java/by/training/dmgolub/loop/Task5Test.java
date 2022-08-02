package by.training.dmgolub.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

class Task5Test {

    private static final Function<Integer, Double> func =
            n -> 1 / Math.pow(2, n) + 1 / Math.pow(3, n);

    @Test
    public void sumOfMembers_shouldPrint2Point0_whenN4E1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String expected = "2.0";

        Task5.sumOfMembers(4, 1, func);

        assertEquals(expected, out.toString());
    }
}