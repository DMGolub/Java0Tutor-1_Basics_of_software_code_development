package by.training.dmgolub.linearprogram;

/*  Модуль 1, блок "Линейные программы"
    Задание 1:
    Найдите значение функции z = ((a - 3) * b / 2) + c              */
public class Task1 {

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