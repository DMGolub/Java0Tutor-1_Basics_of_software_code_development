package by.training.dmgolub.linearprogram;

import java.util.Scanner;

import static by.training.dmgolub.parser.Parser.tryParseDouble;

/*  Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
    Поменять местами дробную и целую части числа и вывести полученное значение числа.       */
public class Task4 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter a double value with three digits " +
                    "in integer part and three digits in fractional parts: nnn.ddd");
            double number = tryParseDouble(scanner, "number");
            swapFractionalAndIntegerParts(number);
        }
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