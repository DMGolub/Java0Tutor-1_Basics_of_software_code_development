package by.training.dmgolub.loop;

import java.util.Scanner;

/*  Для каждого натурального числа в промежутке от m до n вывести все делители,
    кроме единицы и самого числа. m и n вводятся с клавиатуры.              */
public class Task7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter m: ");
        int m = scanner.nextInt();
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        if (m < n) {
            printDivisorsForRange(m, n);
        } else {
            printDivisorsForRange(n, m);
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