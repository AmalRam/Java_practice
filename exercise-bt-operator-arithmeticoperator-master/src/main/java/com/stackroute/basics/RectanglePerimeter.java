package com.stackroute.basics;
import java.util.Scanner;

public class RectanglePerimeter {
    double length,breadth;
    public static void main(String[] args) {
       new RectanglePerimeter().getValues();

    }

    //get user input from console
    public void getValues() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Input length and breadth");
        length=sc.nextDouble();
        breadth=sc.nextDouble();
        System.out.println(perimeterCalculator(length,breadth));

    }

    //write logic to find perimeter of rectangle here
    public double perimeterCalculator(double length, double breadth) {

        return (2*(length+breadth));
    }
}
