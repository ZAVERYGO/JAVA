package com.Collection.Map.Exercise2;

import com.Collection.Map.Exercise2.Enum.Brand;
import com.Collection.Map.Exercise2.Enum.Color;
import com.Collection.Map.Exercise2.Enum.Model;

import java.util.Objects;

public class Truck extends Car{
    private int loadCapacity;

    public Truck(Brand brand, Model model, Color color, int year, int weight, int loadCapacity) {
        super(brand, model, color, year, weight);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return loadCapacity == truck.loadCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), loadCapacity);
    }
    @Override
    public String toString() {
        return "Truck{" +
                "loadCapacity=" + loadCapacity +
                '}' + super.toString();
    }
}
