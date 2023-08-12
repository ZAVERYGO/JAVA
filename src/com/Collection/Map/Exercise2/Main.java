package com.Collection.Map.Exercise2;

import com.Collection.Map.Exercise2.Enum.Brand;
import com.Collection.Map.Exercise2.Enum.Color;
import com.Collection.Map.Exercise2.Enum.Model;

/*
2. Создать абстрактный класс Car, представляющий собой автомобиль.
        Добавить в него поля: марка, модель, год выпуска + несколько своих.
        Создать 4 класса, являющихся наследниками Car.
        Переопределить во всех 3-х классах методы equals(), hashCode() и toString()
        Создать класс Garage, хранящий в себе HashMap автомобилей,
        в котором ключом является объект автомобиля, значением - количество точно таких автомобилей в гараже.
        Добавить в класс Garage методы для парковки, выезда авто, а также для получения количества определенного вида автомобилей.
        Продемонстрировать работу гаража.
*/
public class Main {
    public static void main(String[] args) {
        Car car1 = new SportCar(Brand.BMV, Model.CABRIOLET, Color.BLACK, 2015, 1200, 290);
        Car car2 = new SportCar(Brand.FIAT, Model.COUPE, Color.WHITE, 2014,  1600,  300);
        System.out.println(car1.equals(car2));
        Garage garage = new Garage();
        garage.park(new Truck(2020, Brand.SKODA, Model.STATION_WAGON, Color.RED, 10));
        garage.park(new Truck(2020, Brand.MERCEDES, Model.STATION_WAGON, Color.WHITE, 15));
        garage.park(new SportCar(2018, Brand.BMV, Model.SEDAN, Color.BLACK, 220));
        garage.park(new RacingCar(2018, Brand.BMV, Model.SEDAN, Color.BLACK, 220));
        System.out.println(garage.toString());
        System.out.println(garage.getCarCountByBrand(Brand.BMV));

        garage.departure(new RacingCar(2018, Brand.BMV, Model.SEDAN, Color.BLACK, 220));
        System.out.println(garage.toString());
        System.out.println(garage.getCarCountByModel(Model.SEDAN));
    }
}
