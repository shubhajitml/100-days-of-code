package com.self.code.twoDimensionalShapes;

import com.self.code.TwoDimensionalShape;

public class Square extends TwoDimensionalShape {

    private double side;

    public Square(double side){
        this.side = side;
    }

    public double calculateArea() {
        return side * side;
    }
}
