package com.company;

public class AreaofTriangle implements Shape {
    int base;
    int height;
    double areaTri;

    public AreaofTriangle(int base, int height) {
        this.base = base;
        this.height = height;
        this.areaTri = (base*height)/2;
    }


    @Override
    public double getArea() {
        return areaTri;
    }
}
