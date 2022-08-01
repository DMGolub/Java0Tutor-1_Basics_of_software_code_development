package by.training.dmgolub.linearprogram;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Task6Test {

    @Test
    public void checkPoint_shouldPrintTrue_whenX0Y0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String expected = "true";

        Task6.checkPoint(0, 0);

        assertEquals(expected, out.toString());
    }

    @Test
    public void checkPoint_shouldPrintFalse_whenX3Y1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String expected = "false";

        Task6.checkPoint(3, 1);

        assertEquals(expected, out.toString());
    }

    @Test
    public void checkPoint_shouldPrintTrue_whenXMinus3YMinus2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String expected = "true";

        Task6.checkPoint(-3, -2);

        assertEquals(expected, out.toString());
    }
}