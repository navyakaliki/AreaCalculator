package com.company;

public class AreaofCircle {
    int radius;
    double areaofCircle;
    public AreaofCircle(int radius) {
        this.radius=radius;
        this.areaofCircle=Math.PI*(radius*radius);
    }

    public double getAreaofCircle(){
                return areaofCircle;
    }
}
