package by.training.dmgolub.branching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    public void maximumOfMinimums_shouldReturn1_whenA1B1C1D1() {
        assertEquals(1, Task2.maximumOfMinimums(1, 1, 1, 1));
    }

    @Test
    public void maximumOfMinimums_shouldReturn3_whenA1B2C3D4() {
        assertEquals(3, Task2.maximumOfMinimums(1, 2, 3, 4));
    }

    @Test
    public void maximumOfMinimums_shouldReturnMinus2_whenAMinus1BMinus2CMinus3DMinus4() {
        assertEquals(-2, Task2.maximumOfMinimums(-1, -2, -3, -4));
    }
}