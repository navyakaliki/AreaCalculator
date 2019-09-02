package com.company;

public class AreaofSquare {
    int side;
    double area=Math.sqrt(side);

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "AreaofSquare{" +
                "side=" + side +
                ", area=" + area +
                '}';
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public AreaofSquare(int side, double area) {
        this.side = side;
        this.area = area;
    }
}
