package by.training.dmgolub.branching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @Test
    public void brickPassesThroughTheHole_shouldReturnFalse_whenBrickX3Y3Z3AndHoleA2B2() {
        Brick brick = new Brick(3, 3, 3);
        Hole hole = new Hole(2, 2);

        assertFalse(Task4.brickPassesThroughTheHole(brick, hole));
    }

    @Test
    public void brickPassesThroughTheHole_shouldReturnTrue_whenBrickX2Y3Z5AndHoleA3B4() {
        Brick brick = new Brick(2, 3, 5);
        Hole hole = new Hole(3, 4);

        assertTrue(Task4.brickPassesThroughTheHole(brick, hole));
    }

    @Test
    public void brickPassesThroughTheHole_shouldReturnTrue_whenBrickX3Y2Z5AndHoleA4B3() {
        Brick brick = new Brick(2, 3, 5);
        Hole hole = new Hole(4, 3);

        assertTrue(Task4.brickPassesThroughTheHole(brick, hole));
    }

    @Test
    public void brickPassesThroughTheHole_shouldReturnTrue_whenBrickX5Y3X2AndHoleA4B3() {
        Brick brick = new Brick(5, 3, 2);
        Hole hole = new Hole(4, 3);

        assertTrue(Task4.brickPassesThroughTheHole(brick, hole));
    }

    @Test
    public void brickPassesThroughTheHole_shouldReturnTrue_whenBrickX52X3AndHoleA4B3() {
        Brick brick = new Brick(5, 2, 3);
        Hole hole = new Hole(4, 3);

        assertTrue(Task4.brickPassesThroughTheHole(brick, hole));
    }
}