package org.example;


public class Rectangle extends Ashape implements Polygon{
    private double width;
    private double length;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {return length*width;}

    @Override
    public double getPerimeter() {return (length+width) * 2;}

    @Override
    public int NumberOfSides(){return 4;}
}
