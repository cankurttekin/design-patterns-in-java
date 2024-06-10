package org.example.Shape;

import java.util.Objects;

public class Rectangle extends Shape {
    public int width;
    public int height;

    public Rectangle() {}

    public Rectangle(Rectangle rectangle) {
        super(rectangle);
        if (rectangle != null) {
            this.width = rectangle.width;
            this.height = rectangle.height;
        }
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }


    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Rectangle) || !super.equals(other)) return false;
        Rectangle otherRectangle = (Rectangle) other;
        return otherRectangle.width == width && otherRectangle.height == height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
