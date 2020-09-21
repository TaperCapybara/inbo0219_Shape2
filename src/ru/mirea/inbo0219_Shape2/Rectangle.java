package ru.mirea.inbo0219_Shape2;
import java.lang.*;
import java.math.*;

public class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle(){
        this.filled = false;
        this.colour = "blue";
        this.width = 3;
        this.length = 5;
    };

    public Rectangle(double width, double length){
        this.filled = false;
        this.colour = "blue";
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String colour, boolean filled){
        this.filled = filled;
        this.colour = colour;
        this.width = width;
        this.length = length;
    }

    public double getWidth(){
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return length * 2 + width * 2;
    }

    @Override
    public String toString(){
        return "Shape: rectangle, width: " + this.width + ", length: " + this.length + ", color: " + this.colour;
    }
}
