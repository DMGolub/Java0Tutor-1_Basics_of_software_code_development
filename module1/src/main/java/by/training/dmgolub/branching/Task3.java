package by.training.dmgolub.branching;

import java.util.Scanner;

import static by.training.dmgolub.parser.Parser.tryParseDouble;

/*  Даны три точки A(x1, y1), B(x2, y2), C(x3, y3).
    Определить, будут ли они расположены на одной прямой.    */
public class Task3 {

    public static void main(String[] args) {
        Point pointA = retrievePointFromConsole("A");
        Point pointB = retrievePointFromConsole("B");
        Point pointC = retrievePointFromConsole("C");
        if (pointsBelongToOneLine(pointA, pointB, pointC)) {
            System.out.println("Points belong to one line");
        } else {
            System.out.println("Points don't belong to one line");
        }
    }

    /**
     * Determines if three specified points belong to one straight line.
     * @param pointA Point, first point,
     * @param pointB Point, second point,
     * @param pointC Point, third point.
     * @return true if three points belong to one line and false otherwise.
     * @author DMGolub
     */
    public static boolean pointsBelongToOneLine(Point pointA, Point pointB, Point pointC) {
        return ((pointA.getX() - pointC.getX()) * (pointB.getY() - pointC.getY()) -
                (pointB.getX() - pointC.getX()) * (pointA.getY() - pointC.getY())) == 0;
    }

    /**
     * Retrieves double coordinates X and Y of a point from console and returns the point.
     * @param pointName String, point name.
     * @return point with specified coordinates and name.
     * @author DMGolub
     */
    public static Point retrievePointFromConsole(String pointName) {
        if (pointName == null) {
            throw new IllegalArgumentException("Point name can not be null!");
        }
        if (pointName.isEmpty()) {
            throw new IllegalArgumentException("Point name can not be an empty string!");
        }
        Scanner scanner = new Scanner(System.in);
        double x = tryParseDouble(scanner,"X coordinate for point");
        double y = tryParseDouble(scanner,"Y coordinate for point");
        return new Point(pointName, x, y);
    }
}