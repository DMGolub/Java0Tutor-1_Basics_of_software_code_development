package by.training.dmgolub.loop;

import by.training.dmgolub.parser.Parser;

import java.util.Scanner;
import java.util.function.Function;

/*  Вычислить значения функции на отрезке [a, b] с шагом h:
    y = x, if x > 2;
    y = -x, if x <= 2;                                   */
public class Task2 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double a = Parser.tryParseDouble(scanner,"range start (a)");
            double b = Parser.tryParseDouble(scanner,"range end (b)");
            double h = Parser.tryParseDouble(scanner,"step (h)");
            if (a < b) {
                computeFunctionValue(a, b, h, func);
            } else {
                computeFunctionValue(b, a, h, func);
            }
        }
    }

    /**
     * Prints values of the given function in the range
     * from start to end in increments of given step.
     * @param rangeStart double coordinate x range start,
     * @param rangeEnd double coordinate x range end,
     * @param step double calculation step,
     * @param func Function to apply.
     * @author DMGolub
     */
    public static void computeFunctionValue(
            double rangeStart,
            double rangeEnd,
            double step,
            Function<Double, Double> func
    ) {
        double currArg = rangeStart;
        while (currArg <= rangeEnd) {
            System.out.println(func.apply(currArg));
            currArg += step;
        }
    }

    private static final Function<Double, Double> func = x -> x > 2 ? x : -x;
}