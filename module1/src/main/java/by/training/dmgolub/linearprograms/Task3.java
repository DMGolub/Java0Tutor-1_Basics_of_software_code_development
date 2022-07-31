package by.training.dmgolub.linearprograms;

/*  Модуль 1, блок "Линейные программы"
    Задание 1:
    Вычислить значение выражения по формуле (все переменные принимают действительное значение):
    (Math.sin(x) + Math.cos(y)) * Math.tan(x * y) / (Math.cos(x) - Math.sin(y))                 */
public class Task3 {

    /**
     * Calculates the value of the function
     * (Math.sin(x) + Math.cos(y)) * Math.tan(x * y) / (Math.cos(x) - Math.sin(y))
     * @param x double
     * @param y double
     * @return calculated value
     * @throws IllegalArgumentException if cos(x) == sin(y)
     * @author DMGolub
     */
    public static double functionValue(double x, double y) {
        if (Math.cos(x) == Math.sin(y)) {
            throw new IllegalArgumentException("cos(x) == sin(y). Division by zero!");
        }
        return (Math.sin(x) + Math.cos(y)) * Math.tan(x * y) / (Math.cos(x) - Math.sin(y));
    }
}