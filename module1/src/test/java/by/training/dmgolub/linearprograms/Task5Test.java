package by.training.dmgolub.linearprograms;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Task5Test {

    @Test
    public void convert_shouldThrowIllegalArgumentException_whenNumberIsNegative() {
        assertThrows(IllegalArgumentException.class,
                () -> Task5.convertSecondsIntoTimePassed(-10));
    }

    @Test
    public void convert_shouldReturn00h00m00s_when0Seconds() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String expected = "00ч 00мин 00с";

        Task5.convertSecondsIntoTimePassed(0);

        assertEquals(expected, out.toString());
    }

    @Test
    public void convert_shouldReturn25h01m03s_when90063Seconds() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String expected = "25ч 01мин 03с";

        Task5.convertSecondsIntoTimePassed(25 * 3600 + 63);

        assertEquals(expected, out.toString());
    }

    @Test
    public void convert_shouldReturn01h01m01s_when3661Seconds() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String expected = "01ч 01мин 01с";

        Task5.convertSecondsIntoTimePassed(3661);

        assertEquals(expected, out.toString());
    }
}