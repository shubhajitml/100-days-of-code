package com.self.code.threeDimensionalShapes;

import com.self.code.ThreeDimensionalShape;

public class Tetrahedron extends ThreeDimensionalShape {
    private double side;

    public Tetrahedron(double side){
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return Math.sqrt(3) * side * side;
    }

    @Override
    public double calculateVolume() {
        return (Math.sqrt(2)/12) * side * side * side;
    }
}
