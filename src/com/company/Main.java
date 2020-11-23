package com.company;

public class Main {

    public static void main(String[] args) {
        Square sq=new Square(2,3);
        System.out.println("S = "+sq.Area());
        System.out.println("P = "+sq.Perimeter());
        Triangle tr=new Triangle(2,3,4);
        System.out.println("S = "+tr.Area());
        System.out.println("P = "+tr.Perimeter());
        Circle circle=new Circle(12);
        System.out.println("S = "+circle.Area());
        System.out.println("P = "+circle.Perimeter());





    }
}
