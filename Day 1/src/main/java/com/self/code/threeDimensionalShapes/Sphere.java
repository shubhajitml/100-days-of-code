package com.self.code.threeDimensionalShapes;

import com.self.code.ThreeDimensionalShape;

public class Sphere extends ThreeDimensionalShape {

    private double radius;

    public Sphere(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double calculateVolume() {
        return (4/3) * Math.PI * radius * radius * radius;
    }
}
