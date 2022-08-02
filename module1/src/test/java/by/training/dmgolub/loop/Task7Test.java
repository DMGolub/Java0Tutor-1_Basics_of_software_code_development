package by.training.dmgolub.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Task7Test {

    @Test
    public void printDivisorsForRange_shouldPrintNotFound_whenM1N2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String expected = "1: no divisors found" + System.lineSeparator()
                + "2: no divisors found" + System.lineSeparator();

        Task7.printDivisorsForRange(1, 2);

        assertEquals(expected, out.toString());
    }

    @Test
    public void printDivisorsForRange_shouldPrint2And3_whenM6N6() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String expected = "6: 2 3" + System.lineSeparator();

        Task7.printDivisorsForRange(6, 6);

        assertEquals(expected, out.toString());
    }
}