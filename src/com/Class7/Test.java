package com.Class7;

import java.awt.*;

public class Test{
    public static void main(String[] args) {
        Triangle geometricFigure1 = new Triangle(3, 4, 5);
        Rectangle geometricFigure2 = new Rectangle(2, 3);
        Circle geometricFigure3 = new Circle(3);
        System.out.println(geometricFigure1.isRectangle());
        System.out.println(geometricFigure1.isTriangle());
        System.out.println(ShapeUtils.isRectangle(geometricFigure1));
        System.out.println(ShapeUtils.isTriangle(geometricFigure1));
        System.out.println(geometricFigure1.getArea());
        System.out.println(geometricFigure2.getArea());
        System.out.println(geometricFigure3.getArea());
        System.out.println(geometricFigure1.equalsArea(geometricFigure2));
        System.out.println(geometricFigure1.equalsPerimeter(geometricFigure2));
        System.out.println(geometricFigure1.getPerimeter());
        System.out.println(geometricFigure2.getPerimeter());
        System.out.println(geometricFigure3.getPerimeter());
        System.out.println(geometricFigure2.getDiagonal());
    }
}
