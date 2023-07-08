package com.self.code.twoDimensionalShapes;

import com.self.code.TwoDimensionalShape;

public class Triangle extends TwoDimensionalShape {
    private double base, height;

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    public double calculateArea() {
        return (double) (0.5 * base * height);
    }

}
