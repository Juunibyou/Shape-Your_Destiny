package org.example;

public class Circle extends Ashape implements Polygon{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {return Math.PI * radius * radius;}

    @Override
    public double getPerimeter() {return 2 * Math.PI * radius;}

    @Override
    public int NumberOfSides(){return 0;}
}
