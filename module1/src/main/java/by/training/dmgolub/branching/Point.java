package by.training.dmgolub.branching;

public class Point {

    private String name;
    private double x;
    private double y;

    public Point(String name, double x, double y) {
        setName(name);
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Point name can not be null!");
        }
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Point name can not be an empty string!");
        }
        this.name = name;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {

        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}