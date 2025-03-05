package it.util.shape;

import java.util.Scanner;

public class rectangle implements Shape {
    private double width;
    private double height;
    @Override
    public void inputParameters() {
        System.out.println("** please input Parameter of ur Rectangle **");
        System.out.println("input da Width: ");
        this.width = new Scanner(System.in).nextDouble();
        System.out.println("input da Height: ");
        this.height = new Scanner(System.in).nextDouble();
    }
    @Override
    public double getArea() {
        return 2 * width * height;
    }
    public double getWidth() {
        return this.width;
    }
    public double getHeight() {
        return this.height;
    }
    public void setWidth(double w) {
        this.width = w;
    }
    public void setHeight(double h) {
        this.height = h;
    }
}

