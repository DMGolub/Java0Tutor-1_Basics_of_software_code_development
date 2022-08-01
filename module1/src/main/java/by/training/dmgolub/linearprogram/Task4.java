package by.training.dmgolub.linearprogram;

/*  Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
    Поменять местами дробную и целую части числа и вывести полученное значение числа.       */
public class Task4 {

    public static void main(String[] args) {
        swapFractionalAndIntegerParts(111.222);
    }

    /**
     * Swaps fractional and integer parts of the given number and prints result.
     * Given number: nnn.rrr, result rrr.nnn.
     * @param number double
     * @author DMGolub
     */
    public static void swapFractionalAndIntegerParts(double number) {
        String givenNumber = String.valueOf(number);
        int pointIndex = givenNumber.indexOf('.');
        String swappedNumber = givenNumber.substring(pointIndex + 1);
        swappedNumber += "." + givenNumber.substring(0, pointIndex);
        System.out.print(swappedNumber);
    }
}