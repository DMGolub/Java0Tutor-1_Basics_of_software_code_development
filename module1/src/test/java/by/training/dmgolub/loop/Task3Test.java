package by.training.dmgolub.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @Test
    public void sumOfSquares_shouldPrint338350_whenCalled() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String expected = "338350";

        Task3.sumOfSquares();

        assertEquals(expected, out.toString());
    }
}