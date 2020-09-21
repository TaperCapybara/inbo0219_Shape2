package ru.mirea.inbo0219_Shape2;
import java.lang.*;

public class Square extends Rectangle{
    protected double side;
    public Square(){
        this.filled = false;
        this.colour = "blue";
        this.side = 3;
        setWidth(this.side);
        setLength(this.side);
    }
    public Square (double side){
        this.filled = false;
        this.colour = "blue";
        this.side = side;
        setWidth(this.side);
        setLength(this.side);
    }
    public Square (double side, String colour, boolean filled){
        this.filled = filled;
        this.colour = colour;
        this.side = side;
        setWidth(this.side);
        setLength(this.side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public String toString(){
        return "Shape: square, side: " + this.side + ", color: " + this.colour;
    }
}
