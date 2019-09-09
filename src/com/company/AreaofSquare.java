package com.company;

public class AreaofSquare {

    int side;
    double area;

    public double getArea() {
        return area;
    }


    public AreaofSquare(int side) {
        this.side = side;
        this.area = side * side;
    }

    }

