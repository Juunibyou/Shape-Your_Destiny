package org.example;


public class App {
    public static void main(String[] args) {
        System.out.println("Shape Your Destiny Progam!");
        Circle circle = new Circle(3);
        IsocelesRightTriangle isocelesRightTriangle = new IsocelesRightTriangle(5);
        Rectangle rectangle = new Rectangle(5, 4);
        RightTriangle rightTriangle = new RightTriangle(5, 3);
        Square square = new Square(4);

        System.out.println("Circle:");
        System.out.println("Area: " + String.format("%.2f", circle.getArea()));
        System.out.println("Perimeter: " + String.format("%.2f",circle.getPerimeter()));

        System.out.println("\nIsosceles Right Triangle:");
        System.out.println("Area: " + String.format("%.2f", isocelesRightTriangle.getArea()));
        System.out.println("Perimeter: " + String.format("%.2f",isocelesRightTriangle.getPerimeter()));
        System.out.println("Number of Sides: " + isocelesRightTriangle.NumberOfSides());

        System.out.println("\nRectangle:");
        System.out.println("Area: " + String.format("%.2f", rectangle.getArea()));
        System.out.println("Perimeter: " + String.format("%.2f",rectangle.getPerimeter()));
        System.out.println("Number of Sides: " + rectangle.NumberOfSides());

        System.out.println("\nRight Triangle:");
        System.out.println("Area: " + String.format("%.2f", rightTriangle.getArea()));
        System.out.println("Perimeter: " + String.format("%.2f", rightTriangle.getPerimeter()));
        System.out.println("Number of Sides: " + rightTriangle.NumberOfSides());

        System.out.println("\nSquare:");
        System.out.println("Area: " + String.format("%.2f", square.getArea()));
        System.out.println("Perimeter: " + String.format("%.2f", square.getPerimeter()));
        System.out.println("Number of Sides: " + square.NumberOfSides());
    }
}
