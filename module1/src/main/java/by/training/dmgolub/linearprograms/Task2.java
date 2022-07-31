package by.training.dmgolub.linearprograms;

/*  Модуль 1, блок "Линейные программы"
    Задание 1:
    Вычислить значение выражения по формуле (все переменные принимают действительное значение):
    (b + sqrt(b * b + 4 * a * c)) / (2 * a) - pow(a, 3) + pow(b, -2)                        */
public class Task2 {

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
        if (a == 0.0 || b == 0) {
            throw new IllegalArgumentException("a == 0. Division by zero!");
        }
        return (b + Math.sqrt(b * b + 4 * a * c)) / (2 * a) - a * a * a + Math.pow(b, -2);
    }
}