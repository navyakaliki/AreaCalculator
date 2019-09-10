package com.company;

public class AreaofSquare implements Shape {

    int side;
    double area;

     @Override
    public double getArea() {
        return area;
    }


    public AreaofSquare(int side) {
        this.side = side;
        this.area = side * side;
    }

    }

