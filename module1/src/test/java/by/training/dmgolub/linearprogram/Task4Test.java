package by.training.dmgolub.linearprogram;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @Test
    public void swap_shouldReturnTheSameNumber_whenPartsAreEqual() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String expected = "111.111";

        Task4.swapFractionalAndIntegerParts(111.111);

        assertEquals(expected, out.toString());
    }

    @Test
    public void swap_shouldReturn111point222_whenNumberIs222point111() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String expected = "111.222";

        Task4.swapFractionalAndIntegerParts(222.111);

        assertEquals(expected, out.toString());
    }
}