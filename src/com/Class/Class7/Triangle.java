package com.Class.Class7;

public class Triangle extends GeometricFigure{
    private int side1;
    private int side2;
    private int side3;


    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    double getArea() {
        double p = (side1 + side2 + side3) / 2.0;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    @Override
    double getPerimeter() {
        return side1 + side2 + side3;
    }

    public int getSide1() {
        return side1;
    }

    public int getSide2() {
        return side2;
    }

    public int getSide3() {
        return side3;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public void setSide3(int side3) {
        this.side3 = side3;
    }
}
