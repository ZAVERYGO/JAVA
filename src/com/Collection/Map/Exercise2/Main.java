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
        Garage garage = new Garage();
        garage.park(new SportCar(Brand.BMW, Model.CABRIOLET, Color.BLACK, 2015, 1200, 290));
        garage.park(new SportCar(Brand.FIAT, Model.COUPE, Color.WHITE, 2014,  1600,  300));
        garage.park(new Truck(Brand.SKODA, Model.COUPE, Color.WHITE, 2020, 3800, 130));
        garage.park(new Truck(Brand.MERCEDES, Model.SEDAN, Color.RED, 2013, 4000, 120));
        garage.park(new SportCar(Brand.BMW, Model.CABRIOLET, Color.GREEN, 2020, 1000, 320));
        garage.park(new SportCar(Brand.FIAT, Model.SEDAN, Color.YELLOW, 2020, 1200, 310));
        System.out.println(garage.toString());
        System.out.println(garage.getAmountCar(Brand.BMW));

        garage.departure(new SportCar(Brand.BMW, Model.CABRIOLET, Color.GREEN, 2020, 1000, 320));
        System.out.println(garage.toString());
        System.out.println(garage.getAmountCar(Brand.BMW));
    }
}
