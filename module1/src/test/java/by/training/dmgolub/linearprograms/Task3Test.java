package by.training.dmgolub.linearprograms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @Test
    public void functionValue_shouldThrowIllegalArgumentException_whenX_Y_() {
        assertThrows(IllegalArgumentException.class,
                () -> Task3.functionValue(Math.PI, 3 * Math.PI / 2));
    }
}