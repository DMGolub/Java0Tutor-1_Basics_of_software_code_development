package by.training.dmgolub.linearprogram;

import java.util.Scanner;

import static by.training.dmgolub.parser.Parser.tryParseDouble;

/*  Вычислить значение выражения по формуле (все переменные принимают действительное значение):
    (b + sqrt(b * b + 4 * a * c)) / (2 * a) - pow(a, 3) + pow(b, -2)                        */
public class Task2 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double a = tryParseDouble(scanner, "a");
            double b = tryParseDouble(scanner, "b");
            double c = tryParseDouble(scanner, "c");
            System.out.println("(b + sqrt(b * b + 4 * a * c)) / (2 * a) - pow(a, 3) + pow(b, -2): "
                    + functionValue(a, b, c));
        }
    }

    /**
     * Calculates the value of the function
     * (b + sqrt(b * b + 4 * a * c)) / (2 * a) - pow(a, 3) + pow(b, -2)
     * @param a double
     * @param b double
     * @param c double
     * @return calculated value
     * @throws IllegalArgumentException if a == 0 or b == 0
     * @author DMGolub
     */
    public static double functionValue(double a, double b, double c) {
        if (a == 0.0 || b == 0.0) {
            throw new IllegalArgumentException("a == 0. Division by zero!");
        }
        return (b + Math.sqrt(b * b + 4 * a * c))
                / (2 * a) - a * a * a + Math.pow(b, -2);
    }
}