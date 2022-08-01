package by.training.dmgolub.branching;

/*  Найти max{min(a, b), min(c, d)}                 */
public class Task2 {

    /**
     * Returns maximum of two minimums.
     * @param a double,
     * @param b double,
     * @param c double,
     * @param d double.
     * @return max(min(a, b), min(c, d))
     * @author DMGolub
     */
    public static double maximumOfMinimums(double a, double b, double c, double d) {
        return max(min(a, b), min(c, d));
    }

    private static double max(double a, double b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    private static double min(double a, double b) {
        if (a < b) {
            return a;
        }
        return b;
    }
}