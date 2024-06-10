package org.example;

import org.example.Shape.Circle;
import org.example.Shape.Rectangle;
import org.example.Shape.Shape;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Prototype Pattern ... \n");

        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesClone = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";
        shapes.add(rectangle);

        cloneAndCompare(shapes, shapesClone);

    }

    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesClone) {
        for (Shape shape : shapes) {
            shapesClone.add(shape.clone());
        }

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesClone.get(i)) {
                System.out.println(i + ": Shapes are different objects.");
                if (shapes.get(i).equals(shapesClone.get(i))) {
                } else {
                    System.out.println(i + ": But they are not identical!");
                }
            } else {
                System.out.println(i + ": Shape objects are the same!");
            }
            System.out.println("shapes.get(" + i + "): " + shapes.get(i) + " | shapesClone.get(" + i + "): " +shapesClone.get(i));
            System.out.println();
        }
    }
}