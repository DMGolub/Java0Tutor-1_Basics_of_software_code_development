package by.training.dmgolub.branching;

/**
 * Represents a rectangular brick with sizes X, Y and Z.
 * @author DMGolub
 */
public class Brick {

    private double sizeX;
    private double sizeY;
    private double sizeZ;

    public Brick(double sizeX, double sizeY, double sizeZ) {
        setSizeX(sizeX);
        setSizeY(sizeY);
        setSizeZ(sizeZ);
    }

    public double getSizeX() {
        return sizeX;
    }

    public void setSizeX(double sizeX) {
        if (sizeX <= 0) {
            throw new IllegalArgumentException("Brick size X must be greater than 0");
        }
        this.sizeX = sizeX;
    }

    public double getSizeY() {
        return sizeY;
    }

    public void setSizeY(double sizeY) {
        if (sizeY <= 0) {
            throw new IllegalArgumentException("Brick size Y must be greater than 0");
        }
        this.sizeY = sizeY;
    }

    public double getSizeZ() {
        return sizeZ;
    }

    public void setSizeZ(double sizeZ) {
        if (sizeZ <= 0) {
            throw new IllegalArgumentException("Brick size Z must be greater than 0");
        }
        this.sizeZ = sizeZ;
    }
}