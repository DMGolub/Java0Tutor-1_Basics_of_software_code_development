package by.training.dmgolub.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @Test
    public void productOfSquares_shouldPrint36_whenNuberIs3() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String expected = "36";

        Task4.productOfSquares(3);

        assertEquals(expected, out.toString());
    }
}