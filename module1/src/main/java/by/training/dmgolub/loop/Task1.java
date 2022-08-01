package by.training.dmgolub.loop;

import java.math.BigInteger;
import java.util.Scanner;

/*  Напишите программу, где пользователь вводит любое целое положительное число.
    А программа суммирует все числа от 1 до введенного пользователем числа.         */
public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger number = scanner.nextBigInteger();
        sumOfAllNumbers(number);
    }

    /**
     * Calculates and prints the sum of all numbers from 1 to the given number.
     * @param number BigInteger
     * @author DMGolub
     */
    public static void sumOfAllNumbers(BigInteger number) {
        BigInteger result = BigInteger.ZERO;
        for (BigInteger i = BigInteger.ONE; i.compareTo(number) <= 0;
             i = i.add(BigInteger.ONE)) {
            result = result.add(i);
        }
        System.out.print(result);
    }
}