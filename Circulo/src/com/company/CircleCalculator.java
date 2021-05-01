package com.company;
import java.util.Scanner;

public class CircleCalculator {

    public static void main(String[] args, int radius) {
	// write your code here
        getRadius();
        displayCircumference(radius);
        displayArea(radius);
    }
    private static double getRadius() {
        Scanner entrada = new Scanner(System.in);
        double radius;

        System.out.print("Enter a radius ");
        radius = entrada.nextDouble();
        return radius;
    }
    private static void displayArea(double radius) {
        Scanner entrada = new Scanner(System.in);
        double area;

        area = Math.PI * (radius * radius);

        System.out.println("The area is " + area );
    }
    private static void displayCircumference(int radius) {
        Scanner entrada = new Scanner(System.in);
        double longitud;

        longitud = 2 * Math.PI * radius;

        System.out.print("The circumference is: " + longitud);

    }
    public static void main(String[] args) {
        CircleCalculator calc = new CircleCalculator();

        double radius = calc.getRadius();
        calc.displayArea(radius);
        calc.displayCircumference((int) radius);
        }



    }
