package com.company;

public class Square extends AbstractShare {
    private final double width;
    private final double length;
    public Square(double width,double length){
        this.width=width;
        this.length=length;
    }
    @Override
    protected double Area() {
        return width*length;
    }

    @Override
    protected double Perimeter() {
        return 2*(width+length);
    }
}
