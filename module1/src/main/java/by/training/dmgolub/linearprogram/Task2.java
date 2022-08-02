package by.training.dmgolub.linearprogram;

import java.util.Scanner;

/*  Вычислить значение выражения по формуле (все переменные принимают действительное значение):
    (b + sqrt(b * b + 4 * a * c)) / (2 * a) - pow(a, 3) + pow(b, -2)                        */
public class Task2 {

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