package com.company;

import static com.company.Main.CorrectNumber;

public class Circle extends AbstractShare {
    private  final double radius;
    private final  double pi=Math.PI;
    public Circle(double radius){

        this.radius=radius;
    }

    @Override
    protected double Area() {
        return pi*Math.pow(radius,2);
    }

    @Override
    protected double Perimeter() {
        return 2*pi*radius;
    }
}
