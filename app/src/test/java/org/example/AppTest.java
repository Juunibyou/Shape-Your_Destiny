package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

  @Test
  public void testCircle(){
  Circle circle = new Circle(1);

  assertEquals(3.14, circle.getArea(), 0.01);
  assertEquals(6.28, circle.getPerimeter(),0.01);
  }

  @Test
  public void testRectangle(){
    Rectangle rectangle = new Rectangle(5, 3);

    assertEquals(15.00, rectangle.getArea(), 0.01);
    assertEquals(16.00, rectangle.getPerimeter(), 0.01);
  }

  @Test
  public void testRightTriangle(){
    RightTriangle righttriangle = new RightTriangle(3, 4);

    assertEquals(6.0, righttriangle.getArea(), 0.01);
    assertEquals(12.0, righttriangle.getPerimeter(), 0.01);
  }

  @Test
  public void testSquare(){
    Square square = new Square(5);

    assertEquals(25, square.getArea(), 0.01);
    assertEquals(20, square.getPerimeter(), 0.01);
  }

  @Test
  public void testIsocelesRightTriangle(){
    IsocelesRightTriangle isocelesrighttriangle = new IsocelesRightTriangle(5);

    assertEquals(12.5, isocelesrighttriangle.getArea(), 0.01);
    assertEquals(17.07, isocelesrighttriangle.getPerimeter(), 0.01);
  }
}
