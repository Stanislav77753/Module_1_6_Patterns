package com.stanislav.patterns.structural.flyweight;

import sun.security.provider.SHA;

import java.util.ArrayList;
import java.util.List;

public class FlyweightRunner {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        List<Shape> shapeList = new ArrayList<>();

        shapeList.add(shapeFactory.getShapeByNAme("квадрат"));
        shapeList.add(shapeFactory.getShapeByNAme("квадрат"));
        shapeList.add(shapeFactory.getShapeByNAme("квадрат"));
        shapeList.add(shapeFactory.getShapeByNAme("квадрат"));
        shapeList.add(shapeFactory.getShapeByNAme("круг"));
        shapeList.add(shapeFactory.getShapeByNAme("круг"));
        shapeList.add(shapeFactory.getShapeByNAme("круг"));

        for(Shape shape: shapeList){
            shape.draw();
        }
    }
}
