package org.example.Shape;

import java.util.Objects;

public class Circle extends Shape {
    public int radius;

    public Circle() {}

    public Circle(Circle circle) {
        super(circle);
        if (circle != null) {
            this.radius = circle.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Circle) || !super.equals(other)) return false;
        Circle otherCircle = (Circle) other;
        return otherCircle.radius == radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
