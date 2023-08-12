package com.Collection.Map.Exercise2;

import com.Collection.Map.Exercise2.Enum.Brand;
import com.Collection.Map.Exercise2.Enum.Color;
import com.Collection.Map.Exercise2.Enum.Model;

import java.util.Objects;

public abstract class Car {
    private Brand brand;
    private Model model;
    private Color color;
    private int year;
    private int weight;

    public Car(Brand brand, Model model, Color color, int year, int weight) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        System.out.println(o.getClass());
        Car car = (Car) o;
        return year == car.year && weight == car.weight && brand == car.brand && model == car.model && color == car.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, color, year, weight);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand=" + brand +
                ", model=" + model +
                ", color=" + color +
                ", year=" + year +
                ", weight=" + weight +
                '}';
    }

    public Brand getBrand() {
        return brand;
    }

    public Model getModel() {
        return model;
    }

    public Color getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public int getWeight() {
        return weight;
    }
}
