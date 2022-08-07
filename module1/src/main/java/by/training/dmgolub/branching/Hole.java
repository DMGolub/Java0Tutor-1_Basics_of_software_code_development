package by.training.dmgolub.branching;

/**
 * Represents a rectangular hole with sizes A and B.
 * @author DMGolub
 */
public class Hole {

    private double sizeA;
    private double sizeB;

    public Hole(double holeSizeA, double holeSizeB) {
        setSizeA(holeSizeA);
        setSizeB(holeSizeB);
    }

    public double getSizeA() {
        return sizeA;
    }

    public void setSizeA(double sizeA) {
        if (sizeA <= 0) {
            throw new IllegalArgumentException("Hole size A must be greater than 0");
        }
        this.sizeA = sizeA;
    }

    public double getSizeB() {
        return sizeB;
    }

    public void setSizeB(double sizeB) {
        if (sizeB <= 0) {
            throw new IllegalArgumentException("Hole size B must be greater than 0");
        }
        this.sizeB = sizeB;
    }
}