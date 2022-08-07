package by.training.dmgolub.branching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    public void isTriangle_shouldReturnFalse_whenAngles91And89() {
        assertFalse(Task1.isTriangle(91, 89));
    }

    @Test
    public void isTriangle_shouldReturnFalse_whenAngles100And90() {
        assertFalse(Task1.isTriangle(100, 90));
    }

    @Test
    public void isTriangle_shouldReturnTrue_whenAngles30And60() {
        assertTrue(Task1.isTriangle(30, 60));
    }

    @Test
    public void isRightTriangle_shouldReturnFalse_whenAngles45And40() {
        assertFalse(Task1.isRightTriangle(45, 40));
    }

    @Test
    public void isRightTriangle_shouldReturnTrue_whenAngles90And30() {
        assertTrue(Task1.isRightTriangle(90, 30));
    }

    @Test
    public void isRightTriangle_shouldReturnTrue_whenAngles60And90() {
        assertTrue(Task1.isRightTriangle(60, 90));
    }

    @Test
    public void isRightTriangle_sholudReturnTrue_whenAngles30And60() {
        assertTrue(Task1.isRightTriangle(30, 60));
    }
}