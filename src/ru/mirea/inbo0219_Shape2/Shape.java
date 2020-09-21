package ru.mirea.inbo0219_Shape2;
import java.lang.*;

public abstract class Shape {
    protected String colour;
    protected boolean filled;

    public Shape(){
        this.filled = false;
        this.colour = "blue";
    };

    public Shape(String colour, boolean filled){
        this.colour = colour;
        this.filled = filled;
    };

    public String getColour() {
        return colour;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public abstract String toString();
}
