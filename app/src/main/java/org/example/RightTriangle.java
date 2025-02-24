package org.example;

public class RightTriangle extends Ashape implements Polygon{
    private double width;
    private double length;

    public RightTriangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getDimension(){return length;}

    @Override
    public double getArea(){return 0.5 * length * width;}

    @Override
    public double getPerimeter(){return length + width + Math.sqrt(length*length + width*width);}

    @Override
    public int NumberOfSides(){return 3;}
}
