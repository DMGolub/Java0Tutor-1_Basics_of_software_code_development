package by.training.dmgolub.loop;

import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Iterator;

/*  Даны 2 числа. Определить цифры, входящие в запись
    как первого, так и второго числа.               */
public class Task8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();
        printFiguresContainedInBothNumbers(number1, number2);
    }

    /**
     * Prints unique figures contained in both given numbers.
     * @param n1 integer first number,
     * @param n2 integer second number.
     * @author DMGolub
     */
    public static void printFiguresContainedInBothNumbers(int n1, int n2) {
        Set<Integer> figures = new TreeSet<>(numberToSetOfFigures(n1));
        figures.retainAll(numberToSetOfFigures(n2));
        boolean first = true;
        Iterator<Integer> iterator = figures.iterator();
        boolean isFirst = true;
        while (iterator.hasNext()) {
            if (!isFirst) {
                System.out.print(" ");
            }
            isFirst = false;
            System.out.print(iterator.next());
        }
    }

    /**
     * Converts given number into HashSet of figures.
     * @param number integer number
     * @return HashSet of figures.
     * @author DMGolub
     */
    private static Set<Integer> numberToSetOfFigures(int number) {
        Set<Integer> result = new HashSet<>();
        while (number > 0) {
            result.add(number % 10);
            number /= 10;
        }
        return result;
    }
}