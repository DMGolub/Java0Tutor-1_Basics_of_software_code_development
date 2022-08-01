package by.training.dmgolub.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    public void sumOfAllNumbers_shouldPrint5050_whenNumberIs100() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String expected = "5050";

        Task1.sumOfAllNumbers(BigInteger.valueOf(100));

        assertEquals(expected, out.toString());
    }
}