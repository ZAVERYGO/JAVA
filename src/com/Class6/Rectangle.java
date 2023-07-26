package com.Class6;

public class Rectangle {
    private Point first;
    private Point second;

    public Rectangle(Point first, Point second) {
        this.first = first;
        this.second = second;
    }
    public int square(){
        return (second.getX() - first.getX()) * (second.getY() - first.getY());
    }
    public double diagonal(){
        return Math.sqrt(Math.pow(second.getX() - first.getX(), 2) + Math.pow(second.getY() - first.getY(), 2));
    }
}
