package by.training.dmgolub.branching;

/*  Вычислить значение функции:
    x * x - 3 * x + 9, если x <= 3,
    1 / (x * x * x - 6), если x > 3.            */
public class Task5 {

    /**
     * Calculates the value of the function:
     * x * x - 3 * x + 9, if x <= 3,
     * 1 / (x * x * x - 6), if x > 3.
     * @param x double.
     * @return calculated value.
     * @throws IllegalArgumentException if (x * x * x == 3)
     * @author DMGolub
     */
    public static double functionValue(double x) {
        if (x * x * x == -6) {
            throw new IllegalArgumentException("x ^ 3 == 6. Division by zero!");
        }
        if (x <= 3) {
            return x * x - 3 * x + 9;
        } else {
            return 1 / (x * x * x + 6);
        }
    }
}
