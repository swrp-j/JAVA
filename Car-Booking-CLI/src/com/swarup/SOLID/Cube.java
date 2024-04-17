package com.swarup.SOLID;

public class Cube implements Shape, ThreeDimensionalShape{


    @Override
    public int area() {
        return 12;
    }

    @Override
    public int volume() {
        return 12;
    }
}
