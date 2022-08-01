package by.training.dmgolub.linearprogram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    public void functionValue_shouldThrowIllegalArgumentException_whenA0() {
        assertThrows(IllegalArgumentException.class,
                () -> Task2.functionValue(0, 1, 1));
    }

    @Test
    public void functionValue_shouldThrowIllegalArgumentException_whenB0() {
        assertThrows(IllegalArgumentException.class,
                () -> Task2.functionValue(1, 0, 1));
    }

    @Test
    public void functionValue_shouldReturnMinus6_whenA2B1C1() {
        assertEquals(-6, Task2.functionValue(2, 1,1));
    }
}