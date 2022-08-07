package by.training.dmgolub.loop;

import java.math.BigInteger;

/*  Составить программу нахождения произведения квадратов первых двухсот чисел.     */

/**
 * Calculates and prints the result of multiplication of the first two hundred elements.
 * @author DMGolub
 */
public class Task4 {

    public static void main(String[] args) {
        int numberOfElements = 200;
        System.out.print("Result of multiplication of the first "
                + numberOfElements + " elements");
        productOfSquares(numberOfElements);
    }

    /**
     * Calculates and prints the result of multiplication of the first N elements.
     * @param number integer number of numbers.
     * @author DMGolub
     */
    public static void productOfSquares(int number) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= number; ++i) {
            result = result.multiply(BigInteger.valueOf((long) i * i));
        }
        System.out.print(result);
    }
}