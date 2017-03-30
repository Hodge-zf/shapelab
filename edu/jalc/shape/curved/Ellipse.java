package edu.jalc.shape.curved;

import java.lang.Math.*;
import edu.jalc.shape.TwoDimensionalShape;

public class Ellipse extends TwoDimensionalShape{

  private double minorAxis, majorAxis;

  private Ellipse()
  {
    this.minorAxis=0;
    this.majorAxis=0;
  }

  public Ellipse(double minorAxis, double majorAxis)
  {
    this.minorAxis=minorAxis;
    this.majorAxis=majorAxis;
  }

  public double getPerimeter()
  {
    return 2*Math.PI*Math.sqrt((Math.pow(minorAxis,2) + Math.pow(majorAxis,2))/2);
  }

  public double getArea()
  {
    return Math.PI*minorAxis*majorAxis;
  }

  public String toString()
  {
    return "The ellipse has a perimeter of " + getPerimeter() + "and an area of " + getArea();
  }
}