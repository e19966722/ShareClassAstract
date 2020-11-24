package com.company;

import java.util.Scanner;

import static com.company.Main.CorrectNumber;

public class Triangle extends AbstractShare {
    private  double a;
    private  double b;
    private  double c;


    public Triangle(double a, double b, double c) {
        Scanner scan = new Scanner(System.in);

        while (a <= 0 || b <= 0 || c <= 0) {
            a = CorrectNumber(scan);
            b = CorrectNumber(scan);
            c = CorrectNumber(scan);
            if (c > 0 && a > 0 && b > 0) {
                this.a = a;
                this.b = b;
                this.c = c;
        }
        }
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
