package com.example.w22comp1011gcw11;

public class Rectangle {
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isSquare()
    {
        return false;
    }

    public double getArea()
    {
        return -1;
    }

    public double getPerimeter()
    {
        return -1;
    }
}
