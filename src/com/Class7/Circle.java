package com.Class7;

public class Circle extends GeometricFigure{
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }
    @Override
    double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    double getPerimeter() {
        return Math.PI * 2 * radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
}
