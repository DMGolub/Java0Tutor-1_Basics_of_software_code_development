package by.training.dmgolub.branching;

import java.util.Scanner;

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
     * Defines if three specified points belong to one straight line.
     * @param pointA Point, first point,
     * @param pointB Point, second point,
     * @param pointC Point, third point.
     * @return true if three points belong to one line and false otherwise.
     */
    public static boolean pointsBelongToOneLine(Point pointA, Point pointB, Point pointC) {
        return ((pointA.getX() - pointC.getX()) * (pointB.getY() - pointC.getY()) -
                (pointB.getX() - pointC.getX()) * (pointA.getY() - pointC.getY())) == 0;
    }

    /**
     * Retrieves double coordinates X and Y of a point from console and returns the point.
     * @param pointName String, point name.
     * @return point with specified coordinates and name.
     */
    public static Point retrievePointFromConsole(String pointName) {
        if (pointName == null) {
            throw new IllegalArgumentException("Point name can not be null!");
        }
        if (pointName.isEmpty()) {
            throw new IllegalArgumentException("Point name can not be an empty string!");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter X coordinate for point " + pointName + ": ");
        double x = scanner.nextDouble();
        System.out.print("Enter Y coordinate for point " + pointName + ": ");
        double y = scanner.nextDouble();
        return new Point(pointName, x, y);
    }
}