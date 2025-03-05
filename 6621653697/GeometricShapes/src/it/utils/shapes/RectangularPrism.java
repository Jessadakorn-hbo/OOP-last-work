package it.utils.shapes;

public class RectangularPrism implements GeometricShapes{
    private double width;
    private double height;
    private double length;

    public RectangularPrism(double w, double h, double l) {
        this.width = w;
        this.height = h;
        this.length = l;
    }
    @Override
    public double getVolume() {
        return length*width*height;
    }

    @Override
    public double getTotalSurfaceArea() {
        return 2*(length*width + length*height + width*height);
    }
    public double getDiagonal() {
        return Math.sqrt(length*length + width*width + height*height);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }
}
