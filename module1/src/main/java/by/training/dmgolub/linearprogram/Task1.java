package by.training.dmgolub.linearprogram;

import java.util.Scanner;

/*    Найдите значение функции z = ((a - 3) * b / 2) + c             */
public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();
        System.out.println("Result: " + functionValue(a, b, c));
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