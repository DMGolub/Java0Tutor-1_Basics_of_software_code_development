package by.training.dmgolub.branching;

import java.util.Scanner;

import static by.training.dmgolub.parser.Parser.tryParseInt;

/*  Даны два угла треугольника (в градусах). Определить, существует ли
    такой треугольник, и если да, то будет ли он прямоугольным.     */
public class Task1 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int angle1 = tryParseInt(scanner, "first angle");
            int angle2 = tryParseInt(scanner, "second angle");
            if (isTriangle(angle1, angle2)) {
                if (isRightTriangle(angle1, angle2)) {
                    System.out.println("Is right triangle");
                } else {
                    System.out.println("Is not right triangle");
                }
            } else {
                System.out.println("Is not a triangle");
            }
        }
    }

    /**
     * Determines whether a triangle with the specified angles exists.
     * @param angle1 integer first angle (degrees),
     * @param angle2 integer second angle (degrees).
     * @return true if triangle with given angles exists and false otherwise.
     * @author DMGolub
     */
    public static boolean isTriangle(int angle1, int angle2) {
        return angle1 + angle2 < 180;
    }

    /**
     * Determines whether a triangle with the specified angle is the right
     * triangle (one angle is 90 degrees).
     * @param angle1 integer first angle (degrees),
     * @param angle2 integer second angle (degrees).
     * @return true if triangle with given angles is right and false otherwise.
     * @author DMGolub
     */
    public static boolean isRightTriangle(double angle1, double angle2) {
        return angle1 == 90 || angle2 == 90 || (angle1 + angle2 == 90);
    }
}