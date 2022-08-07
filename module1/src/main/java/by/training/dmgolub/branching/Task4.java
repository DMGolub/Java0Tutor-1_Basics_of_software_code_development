package by.training.dmgolub.branching;

import java.util.Scanner;

/*  Заданы размеры A, B прямоугольного отверстия и размеры x, y, z кирпича.
    Определить, пройдет ли кирпич через отверстие.                       */
public class Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter hole size A: ");
        double holeSizeA = scanner.nextDouble();
        System.out.print("Enter hole size B: ");
        double holeSizeB = scanner.nextDouble();
        Hole hole = new Hole(holeSizeA, holeSizeB);

        System.out.print("Enter brick size X: ");
        double brickSizeX = scanner.nextDouble();
        System.out.print("Enter brick size Y: ");
        double brickSizeY = scanner.nextDouble();
        System.out.print("Enter brick size Z: ");
        double brickSizeZ = scanner.nextDouble();
        Brick brick = new Brick(brickSizeX, brickSizeY, brickSizeZ);

        if (brickPassesThroughTheHole(brick, hole)) {
            System.out.println("Brick passes through the hole.");
        } else {
            System.out.println("Brick can not pass through the hole.");
        }
    }

    /**
     * Defines if the brick can pass through the hole.
     * @param brick Brick,
     * @param hole Hole.
     * @return true if he brick can pass through the hole or false otherwise.
     * @author DMGolub
     */
    public static boolean brickPassesThroughTheHole(Brick brick, Hole hole) {
        return (brick.getSizeX() < hole.getSizeA() && brick.getSizeY() < hole.getSizeB())
                || (brick.getSizeX() < hole.getSizeB() && brick.getSizeY() < hole.getSizeA())
                || (brick.getSizeX() < hole.getSizeA() && brick.getSizeZ() < hole.getSizeB())
                || (brick.getSizeX() < hole.getSizeB() && brick.getSizeZ() < hole.getSizeA())
                || (brick.getSizeY() < hole.getSizeA() && brick.getSizeZ() < hole.getSizeB())
                || (brick.getSizeY() < hole.getSizeB() && brick.getSizeZ() < hole.getSizeA());
    }
}