package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("next Square width ");
        double a = CorrectNumber(scan);
        System.out.print("next Square length ");
        double b = CorrectNumber(scan);
        Square sq = new Square(a, b);
        System.out.println("S Square = " + sq.Area());
        System.out.println("P Square = " + sq.Perimeter());
        System.out.print("next a = ");
        System.out.print("next b = ");
        b = CorrectNumber(scan);
        System.out.print("next b = ");
        double c = CorrectNumber(scan);
        Triangle tr = new Triangle(a, b, c);
        System.out.println("S  Triangle = " + tr.Area());
        System.out.println("P  Triangle= " + tr.Perimeter());
        a = CorrectNumber(scan);
        System.out.print("next radius circle = ");
        Circle circle = new Circle(a);
        System.out.println("S  Circle = " + circle.Area());
        System.out.println("P  Circle= " + circle.Perimeter());
    }

    public static double CorrectNumber(Scanner sc) {
        boolean  k=sc.hasNextDouble();
        while (!k) {
            System.out.print("The input is not an integer ");
            System.out.print("enter number  ");

            sc.next();
            k=sc.hasNextDouble();
        }

        return sc.nextDouble();
    }
       }
