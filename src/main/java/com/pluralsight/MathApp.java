package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        //question one
        double bobSalary = 10000.00;
        double garySalary = 7000.00;
        double highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("Highest salary is: " + highestSalary);
        System.out.println(); //just a new line to divide questions

        //question two
        double carPrice = 35869.99;
        double truckPrice = 65250.99;
        System.out.println("Lowest price is: " + Math.min(carPrice, truckPrice));
        System.out.println(); //just a new line to divide questions

        //question three
        double radius = 7.25;
        System.out.println("Area of a circle is: " + Math.PI*Math.pow(radius, 2));
        System.out.println(); //just a new line to divide questions

        //question four
        double hypotenuse = 5.0;
        System.out.println("Square root of hypotenuse is " + Math.sqrt(hypotenuse));
        System.out.println(); //just a new line to divide questions

        //question five
        int x1 = 5;
        int x2 = 85;
        int y1 = 10;
        int y2 = 50;
        double disntace = Math.sqrt(Math.pow((y1 - y2),2) + Math.pow((x1 - x2),2));
        System.out.println("The distance between two points: " + disntace);
        System.out.println(); //just a new line to divide questions

        //question six
        double negativeValue = -3.8;
        double absValue = Math.abs(negativeValue);
        System.out.println("The absolute value of " + negativeValue + " is " + absValue);
        System.out.println(); //just a new line to divide questions

        //question seven
        System.out.println("Random number between 0 and 1 is " + Math.random());
        System.out.println(); //just a new line to divide questions

        //question eight
        int days = 24;
        int hours = 24;
        int minutes = 60;
        int seconds = 60;
        System.out.println(days*hours*minutes*seconds + " is number of seconds in 24 days");

        System.out.println(); //just a new line to divide questions

    }
}
