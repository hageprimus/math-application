package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        //Question 1:
        int bobSalary = 100_000;
        int garySalary = 120_000;
        int highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is: " + highestSalary);

        //Question 2:
        int carPrice = 60_000;
        int truckPrice = 105_000;
        int lowestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The lowest price is: " + lowestPrice);

        //Question 3:
        double radius = 7.25;
        double area = Math.pow(radius, 2) * Math.PI;
        System.out.println("Area of given circle: " + area);

        //Question 4:
        double num1 = 5.0;
        double sqrt = Math.sqrt(num1);
        System.out.println("Square root of given value: " + sqrt);

        //Question 5:
        double x1 = 5;
        double x2 = 85;
        double y1 = 10;
        double y2 = 50;
        double dist = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("Distance between 2 points: " + dist);

        //Question 6:
        double num2 = -3.8;
        double absolute = Math.abs(num2);
        System.out.println("Absolute value of input: " + absolute);

        //Question 7:
    }
}
