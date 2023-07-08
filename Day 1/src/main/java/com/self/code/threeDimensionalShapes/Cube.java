package com.self.code.threeDimensionalShapes;

import com.self.code.ThreeDimensionalShape;

public class Cube extends ThreeDimensionalShape {

    private double side;

    public Cube(double side){
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return 6 * side * side;
    }

    @Override
    public double calculateVolume() {
        return side * side * side;
    }
}
