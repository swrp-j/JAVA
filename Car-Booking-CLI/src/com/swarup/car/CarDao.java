package com.swarup.car;

import java.util.TreeMap;

public class CarDao {
    private static Car[] cars;



    static {
        cars = new Car[]{
                new Car(1234, 134.3f, "Tesla", true),
                new Car(3123, 14.3f, "BMW", false),
                new Car(5342, 190.6f, "AUDI", false),
                new Car(7642, 54.3f, "Honda", false)
        };

    }
    public  Car[] getCars() {
        return cars;
    }
}
