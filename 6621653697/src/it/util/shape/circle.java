package it.util.shape;

import java.util.Scanner;

public class circle implements Shape {
    private double radius;


    @Override
    public void inputParameters() {
        System.out.println("** please input Parameter of ur circle **");
        System.out.println("Radius: ");
        this.radius = new Scanner(System.in).nextDouble();
    }
    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }
}
