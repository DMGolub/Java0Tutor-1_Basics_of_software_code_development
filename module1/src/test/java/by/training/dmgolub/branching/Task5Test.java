package by.training.dmgolub.branching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task5Test {

    @Test
    public void functionValue_shouldReturn9_whenX0() {
        assertEquals(9, Task5.functionValue(0));
    }

    @Test
    public void functionValue_shouldReturnOneSeventieth_wheX4() {
        assertEquals(1.0d / 70, Task5.functionValue(4));
    }
}