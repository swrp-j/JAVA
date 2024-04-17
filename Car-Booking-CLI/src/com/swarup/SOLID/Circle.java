package com.swarup.SOLID;

public class Circle implements Shape{
    private int radius;

    public Circle(int radius) {
        this.radius = radius;

    }

    public int getRadius() {
        return radius;
    }

    @Override
    public int area() {
        return (int)( Math.PI * Math.pow(getRadius(),2));
    }
}
