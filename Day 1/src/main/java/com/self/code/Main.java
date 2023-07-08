package com.self.code;

import com.self.code.threeDimensionalShapes.Cube;
import com.self.code.threeDimensionalShapes.Sphere;
import com.self.code.threeDimensionalShapes.Tetrahedron;
import com.self.code.twoDimensionalShapes.Circle;
import com.self.code.twoDimensionalShapes.Square;
import com.self.code.twoDimensionalShapes.Triangle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // 1. create list,set,array,map iterate - find by key / index
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(67);
        integers.add(-11);
        System.out.println("Integers array: " + integers);
        System.out.println(integers.get(2));

        Set<String> hashSet = new HashSet<>();
        hashSet.add("hi");
        hashSet.add("hi");
        hashSet.remove("hi");
        hashSet.add("java");
        System.out.println(hashSet.contains("hi"));
        hashSet.add("hi");
        System.out.println(hashSet.contains("hi"));
        for(String s : hashSet){
            System.out.println(s);
        }
        System.out.println(hashSet.size());

        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("c", 0);
        hashMap.put("java", 1);
        hashMap.put("python", 2);
        hashMap.put("c++", 3);
        hashMap.put("php", 4);
        hashMap.remove("php");
        System.out.println(hashMap.containsKey("java"));
        System.out.println(hashMap.getOrDefault("php", 2018));
        System.out.println(hashMap.size());
        for(Map.Entry<String, Integer> hashMapEntry : hashMap.entrySet()){
            System.out.println(hashMapEntry.getKey() + ":" + hashMapEntry.getValue());
        }
        for(String key : hashMap.keySet()){
            System.out.println("key: " + key);
        }
        for(Integer value : hashMap.values()){
            System.out.println("value: " + value);
        }

        // 2. Create Interface - Shape Hierarchy- for triangle , circle , square for area /volume
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