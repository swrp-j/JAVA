package com.swarup.car;

import java.util.Objects;

public class Car {
    int regNum ;
    float price;
    String brand;
    boolean isElectric;


    public int getRegNum() {
        return regNum;
    }

    public float getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public Car(int regNum, float price, String brand, boolean isElectric) {
        this.regNum = regNum;
        this.price = price;
        this.brand = brand;

    }


    @Override
    public String toString() {
        return "Car{" +
                "regNum=" + regNum +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return regNum == car.regNum && Float.compare(price, car.price) == 0 && isElectric == car.isElectric && Objects.equals(brand, car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regNum, price, brand, isElectric);
    }
}
