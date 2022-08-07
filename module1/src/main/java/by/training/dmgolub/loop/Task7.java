package by.training.dmgolub.loop;

import by.training.dmgolub.parser.Parser;

import java.util.Scanner;

/*  Для каждого натурального числа в промежутке от m до n вывести все делители,
    кроме единицы и самого числа. m и n вводятся с клавиатуры.              */
public class Task7 {

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            int m = Parser.tryParseInt(scanner, "range begin (m)");
            int n = Parser.tryParseInt(scanner, "range end (n)");
            if (m < n) {
                printDivisorsForRange(m, n);
            } else {
                printDivisorsForRange(n, m);
            }
        }
    }

    /**
     * Prints all divisors for the given range of numbers and
     * "no divisors found" for numbers with no divisors.
     * @param rangeBegin int first number of the range,
     * @param rangeEnd last number of the range.
     * @author DMGolub
     */
    public static void printDivisorsForRange(int rangeBegin, int rangeEnd) {
        for (int currNumber = rangeBegin; currNumber <= rangeEnd; ++currNumber) {
            boolean isFound = false;
            System.out.print(currNumber + ":");
            for (int divisor = 2; divisor <= currNumber / 2; ++divisor) {
                if (currNumber % divisor == 0) {
                    isFound = true;
                    System.out.print(" " + divisor);
                }
            }
            System.out.println(isFound ? "" : " no divisors found");
        }
    }
}