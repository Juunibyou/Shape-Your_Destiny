package org.example;

public class App {
    public static void main(String[] args) {
        System.out.println("You can write a driver program for your code here!");
        Circle circle = new Circle(3);
        
        System.out.println("Area: " + String.format("%.2f", circle.getArea()));
        System.out.println("Perimeter: " + String.format("%.2f",circle.getPerimeter()));

    }
}
