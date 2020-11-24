package com.company;

import java.util.Scanner;

import static com.company.Main.CorrectNumber;

public class Square extends AbstractShare {
    private  double width;
    private  double length;
    public Square(double width,double length) {
        Scanner scan = new Scanner(System.in);


        while (width <= 0 || length <= 0) {
            width = CorrectNumber(scan);
            length = CorrectNumber(scan);

        }
        if (width > 0 && length > 0) {
            this.width = width;
            this.length = length;

        }
    }
    @Override
    public double Area() {
        return width*length;
    }

    @Override
    protected double Perimeter() {
        return 2*(width+length);
    }
}
