package com.self.code.twoDimensionalShapes;

import com.self.code.TwoDimensionalShape;

public class Circle extends TwoDimensionalShape {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double calculateArea() {
        double area = (double)(Math.PI * radius * radius);
        return area;
    }

}
