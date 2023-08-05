package com.Class.Class6;

public class Test {
    public static void main(String[] args) {
        Point point1 = new Point(1, 5);
        Point point2 = new Point(4, 9);
        System.out.println(point1.distance(point2));
        System.out.println(point2.distance(point1));
        Rectangle rectangle = new Rectangle(point1, point2);
        System.out.println(rectangle.square());
        System.out.println(rectangle.diagonal());
    }
}
