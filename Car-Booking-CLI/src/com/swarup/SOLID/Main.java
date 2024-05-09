package com.swarup.SOLID;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        AreaCalculator areaCalculator = new AreaCalculator();
        Square square = new Square(1);
        Circle circle = new Circle(2);

        List<Shape> shapes = List.of(square, circle);
        int sum = areaCalculator.sum2(shapes);
        printer.json(sum);
        System.out.println(sum);
        Scanner sc = new Scanner(System.in);
        int n = sc.hasNext()


    }
}
