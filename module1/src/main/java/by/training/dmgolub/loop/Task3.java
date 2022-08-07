package by.training.dmgolub.loop;

/*  Найти сумму квадратов первых ста чисел.  */
public class Task3 {

    public static void main(String[] args) {
        System.out.print("Sum of squares of one hundred numbers = ");
        sumOfSquares();
    }

    /**
     * Calculates and prints sum of squares of one hundred numbers.
     * @author DMGolub
     */
    public static void sumOfSquares() {
        int sum = 0;
        for (int i = 1; i <= 100; ++i) {
            sum += i * i;
        }
        System.out.print(sum);
    }
}