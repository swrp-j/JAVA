package com.swarup.SOLID;

import java.util.List;
import java.util.Objects;

public class AreaCalculator {
    public  int sum2(List<Shape> shapes){
        int sum = 0;
        for (int i = 0; i < shapes.size(); i++) {
            sum+= shapes.get(i).area();
        }

        return sum;
    }
}
