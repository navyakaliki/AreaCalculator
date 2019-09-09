package com.company;

public class AreaofTriangle {
    int base;
    int height;
    double areaTri;

    public AreaofTriangle(int base, int height) {
        this.base = base;
        this.height = height;
        this.areaTri = (base*height)/2;
    }
    public double getAreatri() {
        return areaTri;
    }

}
