package com.company;

public class AreaofCircle implements Shape {
    int radius;
    double areaofCircle;
    public AreaofCircle(int radius) {
        this.radius=radius;
        this.areaofCircle=Math.PI*(radius*radius);
    }



    @Override
    public double getArea() {
        return areaofCircle;
    }
}
