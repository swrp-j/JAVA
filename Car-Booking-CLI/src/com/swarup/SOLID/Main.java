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
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("the entered no. is: " +  num);
        while(num > 0){
            System.out.println(num);
            num--;
        }

    }
}
