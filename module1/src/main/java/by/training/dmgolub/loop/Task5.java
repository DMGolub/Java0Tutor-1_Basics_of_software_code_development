package by.training.dmgolub.loop;

import by.training.dmgolub.parser.Parser;

import java.util.Scanner;
import java.util.function.Function;

/*  Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда,
    модуль которых больше или равен заданному е.
    Общий член ряда имеет вид: An = 1 / 2^n + 1 / 3^n                 */
public class Task5 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = Parser.tryParseInt(scanner, "number of elements n");
            double e = Parser.tryParseDouble(scanner, "threshold e");
            sumOfMembers(n, e, func);
        }
    }

    /**
     * Prints sum of those members of the series, whose modulus
     * is greater than or equal to the specified threshold e.
     * @param number integer number of members of the series,
     * @param threshold double threshold,
     * @param func function to apply.
     * @author DMGolub
     */
    public static void sumOfMembers(int number, double threshold,
           Function<Integer, Double> func) {
        double sum = 0;
        for (int i = 0; i < number; ++i) {
            double currMember = func.apply(i);
            if (Math.abs(currMember) >= threshold) {
                sum += currMember;
            }
        }
        System.out.print(sum);
    }

    private static final Function<Integer, Double> func =
            n -> 1 / Math.pow(2, n) + 1 / Math.pow(3, n);
}
