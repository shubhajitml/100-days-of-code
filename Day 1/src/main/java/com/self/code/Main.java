package com.self.code;

import com.self.code.threeDimensionalShapes.Cube;
import com.self.code.threeDimensionalShapes.Sphere;
import com.self.code.threeDimensionalShapes.Tetrahedron;
import com.self.code.twoDimensionalShapes.Circle;
import com.self.code.twoDimensionalShapes.Square;
import com.self.code.twoDimensionalShapes.Triangle;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(5.5), new Square(6), new Triangle(11, 12), new Sphere(4.5)
        , new Cube(8), new Tetrahedron(7.2)};
        for(Shape shape : shapes){
            String shapeType = shape.getClass().getSimpleName();
            if(shape instanceof TwoDimensionalShape){
                System.out.println("Area of " + shapeType + " is : " + ((TwoDimensionalShape) shape).calculateArea());
            }else if(shape instanceof ThreeDimensionalShape){
                System.out.println("Surface area of " + shapeType + " is : " + ((ThreeDimensionalShape) shape).calculateArea());
                System.out.println("Volume of " + shapeType + " is : " + ((ThreeDimensionalShape) shape).calculateVolume());
            }
        }
    }
}