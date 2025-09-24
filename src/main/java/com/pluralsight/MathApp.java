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
    }
}
