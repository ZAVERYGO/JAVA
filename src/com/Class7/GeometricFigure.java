package com.Class7;

public abstract class GeometricFigure implements Equals {
    abstract double getArea();
    abstract double getPerimeter();
    public boolean isTriangle(){
        return this instanceof Triangle;
    }
    public boolean isRectangle(){
        return this instanceof Rectangle;
    }
    @Override
    public boolean equalsArea(GeometricFigure geometricFigure) {
        return this.getArea() == geometricFigure.getArea();
    }

    @Override
    public boolean equalsPerimeter(GeometricFigure geometricFigure) {
        return this.getPerimeter() == geometricFigure.getPerimeter();
    }
}
