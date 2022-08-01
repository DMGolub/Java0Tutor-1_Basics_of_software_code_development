package by.training.dmgolub.linearprograms;

/*  Для данной области составить линейную программу, которая печатает true, если точка
    с координатами (x, y) принадлежит закрашенной области, и false - в противном случае.        */
public class Task6 {

    private static final int Y_TOP_LIMIT = 4;
    private static final int Y_BOTTOM_LIMIT = -3;
    private static final int X_TOP_LIMIT = 2;
    private static final int X_BOTTOM_LIMIT = 4;

    /**
     * Checks if the point with coordinates (x, y) belongs to the given area.
     * @param x double coordinate x,
     * @param y double coordinate y.
     * @author DMGolub
     */
    public static void checkPoint(double x, double y) {
        if ((y > 0 && y <= Y_TOP_LIMIT && Math.abs(x) <= X_TOP_LIMIT)
                || (y <= 0 && y >= Y_BOTTOM_LIMIT && Math.abs(x) <= X_BOTTOM_LIMIT)) {
            System.out.print(true);
        } else {
            System.out.print(false);
        }
    }
}