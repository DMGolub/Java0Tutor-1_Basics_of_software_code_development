package by.training.dmgolub.branching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @Test
    public void retrieve_shouldThrowIllegalArgumentException_whenPointNameIsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> Task3.retrievePointFromConsole(null));
    }

    @Test
    public void retrieve_shouldThrowIllegalArgumentException_whenPointNameIsEmpty() {
        assertThrows(IllegalArgumentException.class,
                () -> Task3.retrievePointFromConsole(""));
    }

    @Test
    public void pointsBelongToOneLine_shouldReturnFalse_when_PointAX1Y2PointBX3Y7PointCX2Y2() {
        Point pointA = new Point("A", 1, 2);
        Point pointB = new Point("B", 3, 7);
        Point pointC = new Point("C", 2, 2);

        assertFalse(Task3.pointsBelongToOneLine(pointA, pointB, pointC));
    }

    @Test
    public void pointsBelongToOneLine_shouldReturnTrue_when_PointAX1Y1PointBX2Y2PointCX3Y3() {
        Point pointA = new Point("A", 1, 1);
        Point pointB = new Point("B", 2, 2);
        Point pointC = new Point("C", 3, 3);

        assertTrue(Task3.pointsBelongToOneLine(pointA, pointB, pointC));
    }

    @Test
    public void pointsBelongToOneLine_shouldReturnTrue_when_PointAX1Y0PointBX5Y0PointCX7Y0() {
        Point pointA = new Point("A", 1, 0);
        Point pointB = new Point("B", 5, 0);
        Point pointC = new Point("C", 7, 0);

        assertTrue(Task3.pointsBelongToOneLine(pointA, pointB, pointC));
    }
}