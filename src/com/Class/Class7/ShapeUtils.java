package com.Class.Class7;

public class ShapeUtils {
public static boolean isRectangle(Rectangle rectangle){
    return rectangle.getHeight() != rectangle.getWidth();
}
public static boolean isTriangle(Triangle triangle){
    return triangle.getSide1() < triangle.getSide2() + triangle.getSide3() &&
            triangle.getSide2() < triangle.getSide1() + triangle.getSide3() &&
            triangle.getSide3() < triangle.getSide2() + triangle.getSide1();
}
    public static boolean isRectangle(GeometricFigure rectangle){
        return rectangle instanceof Rectangle;
    }
    public static boolean isTriangle(GeometricFigure triangle){
        return triangle instanceof Triangle;
    }
}
