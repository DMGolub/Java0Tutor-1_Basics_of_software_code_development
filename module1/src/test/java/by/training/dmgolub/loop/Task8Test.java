package by.training.dmgolub.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Task8Test {

    @Test
    public void printFigures_shouldPrint345_when12345And34567() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String expected = "3 4 5";

        Task8.printFiguresContainedInBothNumbers(12345, 34567);

        assertEquals(expected, out.toString());
    }

    @Test
    public void printFigures_shouldPrintEmptyString_whenNoIntersection() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String expected = "";

        Task8.printFiguresContainedInBothNumbers(111, 222);

        assertEquals(expected, out.toString());
    }

    @Test
    public void printFigures_shouldPrint12_when111222and12345() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String expected = "1 2";

        Task8.printFiguresContainedInBothNumbers(111222, 12345);

        assertEquals(expected, out.toString());
    }
}