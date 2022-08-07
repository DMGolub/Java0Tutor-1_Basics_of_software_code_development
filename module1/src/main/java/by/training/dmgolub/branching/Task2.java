package by.training.dmgolub.branching;

import java.util.Scanner;

import static by.training.dmgolub.parser.Parser.tryParseDouble;

/*  Найти max{min(a, b), min(c, d)}                 */
public class Task2 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double a = tryParseDouble(scanner, "a");
            double b = tryParseDouble(scanner, "b");
            double c = tryParseDouble(scanner, "c");
            double d = tryParseDouble(scanner, "d");
            System.out.println("max{min(a, b), min(c, d)} = "
                    + maximumOfMinimums(a, b, c, d));
        }
    }

    /**
     * Returns maximum of two minimums.
     * @param a double,
     * @param b double,
     * @param c double,
     * @param d double.
     * @return max(min(a, b), min(c, d))
     * @author DMGolub
     */
    public static double maximumOfMinimums(double a, double b, double c, double d) {
        return max(min(a, b), min(c, d));
    }

    private static double max(double a, double b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    private static double min(double a, double b) {
        if (a < b) {
            return a;
        }
        return b;
    }
}