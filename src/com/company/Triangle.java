package com.company;

public class Triangle extends AbstractShare {
    private final double a;
    private final double b;
    private final double c;

    public Triangle(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;

    }

    @Override
    protected double Area() {
        double p=Perimeter()/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    protected double Perimeter() {
        return a+b+c;
    }
}
