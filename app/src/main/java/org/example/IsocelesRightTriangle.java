package org.example;

public class IsocelesRightTriangle extends RightTriangle{
    public IsocelesRightTriangle(double size){
        super(size, size);
    }

    @Override
    public double getArea() {
        return 0.5 * getDimension() * getDimension();
    }

    @Override
    public double getPerimeter() {
        return 2 * getDimension() + (Math.sqrt(2) * getDimension());
    }
}
