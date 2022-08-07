package by.training.dmgolub.linearprogram;

import java.util.Scanner;

import static by.training.dmgolub.parser.Parser.tryParseDouble;

/*    Найдите значение функции z = ((a - 3) * b / 2) + c             */
public class Task1 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double a = tryParseDouble(scanner, "a");
            double b = tryParseDouble(scanner, "b");
            double c = tryParseDouble(scanner, "c");
            System.out.println("(a - 3) * b / 2 + c = " + functionValue(a, b, c));
        }
    }

    /**
     * Calculates the value of the function ((a - 3) * b / 2) + c
     * @param a double
     * @param b double
     * @param c double
     * @return calculated value
     * @author DMGolub
     */
    public static double functionValue(double a, double b, double c) {
        return ((a - 3) * b / 2) + c;
    }
}