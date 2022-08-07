package by.training.dmgolub.branching;

import java.util.Scanner;

import static by.training.dmgolub.parser.Parser.tryParseDouble;

/*  Заданы размеры A, B прямоугольного отверстия и размеры x, y, z кирпича.
    Определить, пройдет ли кирпич через отверстие.                       */
public class Task4 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double holeSizeA = tryParseDouble(scanner, "hole size A");
            double holeSizeB = tryParseDouble(scanner, "hole size B");
            Hole hole = new Hole(holeSizeA, holeSizeB);

            double brickSizeX = tryParseDouble(scanner, "brick size X");
            double brickSizeY = tryParseDouble(scanner, "brick size Y");
            double brickSizeZ = tryParseDouble(scanner, "brick size Z");
            Brick brick = new Brick(brickSizeX, brickSizeY, brickSizeZ);

            if (brickPassesThroughTheHole(brick, hole)) {
                System.out.println("Brick passes through the hole.");
            } else {
                System.out.println("Brick can not pass through the hole.");
            }
        }
    }

    /**
     * Determines if the brick can pass through the hole.
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