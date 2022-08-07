package by.training.dmgolub.loop;

/*  Вывести на экран соответствия между символами
    и их численными обозначениями в памяти компьютера.       */
public class Task6 {

    public static void main(String[] args) {
        printCharsAndCodes();
    }

    /**
     * Prints all characters and their numerical designations.
     * @author DMGolub
     */
    public static void printCharsAndCodes() {
        for (int i = 0; i <= Character.MAX_VALUE; ++i) {
            System.out.println((char) i + " " + i);
        }
    }
}