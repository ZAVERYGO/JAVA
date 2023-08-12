package com.Collection.Map.Exercise2;

import com.Collection.Map.Exercise2.Enum.Brand;
import java.util.HashMap;
import java.util.Map;

public class Garage {
    private final Map<Car, Integer> cars = new HashMap<>();

    public void park(Car car) {
        int count = cars.getOrDefault(car, 0);
        cars.put(car, ++count);
    }

    public void departure(Car car) {
        int count1 = cars.getOrDefault(car, 0);
        int count2 = count1 == 0 ? 0 : --count1;
        cars.put(car, count2);
    }
    public int getAmountCar(Brand brand){
        int count = 0;
        for (Map.Entry<Car, Integer> entry: cars.entrySet()) {
            if(entry.getKey().getBrand() == brand)
                count++;
        }
        System.out.print("Количество машин: " + brand + "= ");
        return count;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "cars=" + cars +
                '}';
    }
}
