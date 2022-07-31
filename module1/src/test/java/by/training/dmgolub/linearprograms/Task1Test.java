package by.training.dmgolub.linearprograms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    public void functionValue_shouldReturn0_whenA0B0C0() {
        assertEquals(0, Task1.functionValue(0, 0, 0));
    }

    @Test
    public void functionValue_shouldReturn1_whenA2B2C2() {
        assertEquals(1, Task1.functionValue(2, 2, 2));
    }

    @Test
    public void functionValue_shouldReturn3whenAMinus2BMinus2CMinus2() {
        assertEquals(3, Task1.functionValue(-2, -2,-2));
    }
}