package com.stanislav.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    public static final Map<String, Shape> shapes = new HashMap<>();
     public Shape getShapeByNAme(String shapeName){
         Shape shape = shapes.get(shapeName);
         if(shape == null){
             switch (shapeName){
                 case "квадрат":
                     System.out.println("создаем квадрат");
                     shape = new Rectangle();
                     break;
                 case "круг":
                     System.out.println("создаем круг");
                     shape = new Circle();
                     break;
             }
             shapes.put(shapeName, shape);
         }
         return shape;
     }
}
