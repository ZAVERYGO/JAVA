package com.Collection.Map.Exercise2;

import com.Collection.Map.Exercise2.Enum.Brand;
import com.Collection.Map.Exercise2.Enum.Color;
import com.Collection.Map.Exercise2.Enum.Model;

import java.util.Objects;

public class Bus extends Car{
    private int amountPassengers;

    public Bus(Brand brand, Model model, Color color, int year, int weight, int amountPassengers) {
        super(brand, model, color, year, weight);
        this.amountPassengers = amountPassengers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bus bus = (Bus) o;
        return amountPassengers == bus.amountPassengers;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), amountPassengers);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "amountPassengers=" + amountPassengers +
                '}' + super.toString();
    }
}
